package org.zuxin.common.design_pattern.creational.singleton;

import com.google.common.base.Throwables;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * 单例调用类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午10:10
 */
@Slf4j
public class AbstractSingleton {
    public static void verify(Class<?> cls) {
        log.info("start");

        //给线程池起一个名字，方便排查问题
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat(
                "singleton-%d").build();
        //存储等待线程的数据
        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue(100);
        //第一个参数corePoolSize，
        ExecutorService executorService = new ThreadPoolExecutor(20, 20,
                10L, TimeUnit.SECONDS, workQueue, namedThreadFactory,
                new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 3; i++) {
            executorService.execute(() -> {
                try {
                    //调用静态方法
                    log.warn("{}", cls.getMethod("getObject").invoke(null));
                    TimeUnit.SECONDS.sleep(1);
                    log.warn("{}: end sleep", Thread.currentThread().getName());
                } catch (Throwable throwable) {
                    log.error("exception: ", Throwables.getStackTraceAsString(throwable));
                }
            });
        }

        //等待所有线程运行结果
        executorService.shutdown();
        //超时时间为10秒
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            log.info("finish or timeout");
        } catch (Throwable throwable) {
            log.error("exception: ", Throwables.getStackTraceAsString(throwable));
        }
    }

    public static void main(String[] args) {
        AbstractSingleton.verify(LazySingleton.class);
        AbstractSingleton.verify(InstantSingleton.class);
        AbstractSingleton.verify(InnerSingleton.class);
    }
}
