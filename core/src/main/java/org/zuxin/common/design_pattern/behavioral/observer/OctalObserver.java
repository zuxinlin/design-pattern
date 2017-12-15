package org.zuxin.common.design_pattern.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 八进制观察类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午4:50
 */
@Slf4j
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int number = subject.getState();
        log.info("{} convert to octal: {}", number, Integer.toOctalString(number));
    }
}
