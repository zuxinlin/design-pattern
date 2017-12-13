package org.zuxin.common.design_pattern.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;

/**
 * Copyright (C) 2016 Taobao.com 淘宝（中国）软件有限公司 版权所有.
 * 商家&运营平台-运营平台
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午11:46
 */
@Slf4j
public class Green implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        log.info("fill green");
    }
}
