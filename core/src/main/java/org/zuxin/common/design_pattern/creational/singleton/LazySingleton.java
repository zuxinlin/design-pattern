package org.zuxin.common.design_pattern.creational.singleton;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。getInstance() 的性能对应用程序很关键。
 *
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/12 下午8:08
 */
public class LazySingleton {
    /**
     * singleton对象，volatile保证所有写在读之前
     */
    private static volatile LazySingleton lazySingleton;

    /**
     * 私有构造函数，保证该类不能被实例化
     */
    private LazySingleton() {
    }

    /**
     * 采用双重校验锁获取唯一可用实例对象，如果synchronize直接加载get方法上，就会造成性能抵消，因为每次获取都会锁住
     * @return
     */
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }

        return lazySingleton;
    }

    public static void main(String[] args) {
        //给线程池起一个名字，方便排查问题

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat(
                "hbase-batch-pool-%d").build();
        //存储等待线程的数据
        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue(100);
        //第一个参数corePoolSize，
        ExecutorService executorService = new ThreadPoolExecutor(20, 20, 10L,
                TimeUnit.SECONDS, workQueue, namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
    }
}
