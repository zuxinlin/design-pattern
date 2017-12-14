package org.zuxin.common.design_pattern.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Copyright (C) 2016 Taobao.com 淘宝（中国）软件有限公司 版权所有.
 * 商家&运营平台-运营平台
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午3:52
 */
@Slf4j
public class SubstractStrategy implements Calculator {
    /**
     * @param firstNum
     * @param secondNum
     * @return
     */
    @Override
    public double calculate(double firstNum, double secondNum) {
        double result = firstNum - secondNum;
        log.info("{} - {} = {}", firstNum, secondNum, result);
        
        return result;
    }
}
