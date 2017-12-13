package org.zuxin.common.design_pattern.creational.factory_method;

/**
 * 形状接口
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午10:56
 */
public interface Shape {
    /**
     * 画形状
     */
    void draw();

    enum SHAPE {
        CIRCLE,
        RECTANGLE,
        SQUARE
    }
}
