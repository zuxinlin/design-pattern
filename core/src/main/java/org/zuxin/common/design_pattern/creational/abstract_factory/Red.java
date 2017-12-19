package org.zuxin.common.design_pattern.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 红色实现类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午11:46
 */
@Slf4j
public class Red implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        log.info("fill red");
    }
}
