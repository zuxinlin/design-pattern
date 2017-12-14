package org.zuxin.common.design_pattern.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 十六进制观察类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午4:50
 */
@Slf4j
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int number = subject.getState();
        log.info("{} convert to hexadecimal: {}", number, Integer.toHexString(number));
    }
}
