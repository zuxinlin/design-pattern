package org.zuxin.common.design_pattern.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 乘法策略类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午3:52
 */
@Slf4j
public class MultiplyStrategy implements Calculator {
    /**
     * @param firstNum
     * @param secondNum
     * @return
     */
    @Override
    public double calculate(double firstNum, double secondNum) {
        double result = firstNum * secondNum;
        log.info("{} * {} = {}", firstNum, secondNum, result);

        return result;
    }
}
