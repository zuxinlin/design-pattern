package org.zuxin.common.design_pattern.behavioral.state;

/**
 * 观察者抽象类，定义收到通知后的操作
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午4:44
 */
public abstract class Observer {
    /**
     * 订阅类对象，用于获取状态更新值
     */
    Subject subject;

    /**
     * 收到通知后，做出相应处理
     */
    public abstract void update();
}
