package org.zuxin.common.design_pattern.creational.singleton;

/**
/**
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 它基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用getInstance方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
 *
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/12 下午7:57
 */
public class Singleton {
    /**
     * 创建一个singleton对象，恶汉模式，事先创造
     */
    private static Singleton singleton = new Singleton();

    /**
     * 私有构造函数，保证该类不能被实例化
     */
    private Singleton() {
    }

    /**
     * 获取唯一可用实例对象
     * @return
     */
    public static Singleton getSingleton() {
        return singleton;
    }

    public void sayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.sayMessage("Hello world");
        singleton.sayMessage("Today weather is good");
    }
}
