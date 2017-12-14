package org.zuxin.common.design_pattern.behavioral.strategy;

/**
 * Copyright (C) 2016 Taobao.com 淘宝（中国）软件有限公司 版权所有.
 * 商家&运营平台-运营平台
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午3:55
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    /**
     *
     * @param firstNum
     * @param secondNum
     * @return
     */
    public double calculate(double firstNum, double secondNum) {
        return calculator.calculate(firstNum, secondNum);
    }

    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        context.calculate(1, 2);

        context = new Context(new SubstractStrategy());
        context.calculate(1, 2);

        context = new Context(new MultiplyStrategy());
        context.calculate(1, 2);
    }
}
