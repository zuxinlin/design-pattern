package org.zuxin.common.design_pattern.behavioral.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 订阅类，包含观察者列表，状态更新时候通知观察者
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午4:43
 */

public class Subject {
    /**
     * 观察对象列表
     */
    private List<Observer> observers;

    /**
     * 观察对象关注的状态值
     */
    private int state;

    public Subject() {
        this.observers = Lists.newArrayList();
    }

    /**
     * 获取状态值
     * @return
     */
    public int getState() {
        return state;
    }

    /**
     * 更新状态值，通知观察者
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(item -> item.update());
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        subject.setState(10);
        subject.setState(15);
    }
}
