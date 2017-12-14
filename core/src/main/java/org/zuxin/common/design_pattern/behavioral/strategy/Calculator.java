package org.zuxin.common.design_pattern.behavioral.strategy;

/**
 * 计算器接口
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午3:27
 */
public interface Calculator {
    /**
     *
     * @param firstNum
     * @param secondNum
     * @return
     */
    double calculate(double firstNum, double secondNum);
}
