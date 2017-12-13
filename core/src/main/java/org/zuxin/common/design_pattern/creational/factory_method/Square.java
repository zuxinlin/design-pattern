package org.zuxin.common.design_pattern.creational.factory_method;

import lombok.extern.slf4j.Slf4j;

/**
 * 正方形实现类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午10:57
 */
@Slf4j
public class Square implements Shape {
    /**
     * 画形状
     */
    @Override
    public void draw() {
        log.info("draw a square");
    }
}
