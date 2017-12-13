package org.zuxin.common.design_pattern.creational.abstract_factory;

import org.zuxin.common.design_pattern.creational.factory_method.Shape;

/**
 * 抽象工厂类，定义创建具体产品工厂的方法
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午11:41
 */
public abstract class AbstractFactory {
    /**
     * 获取形状实例对象
     *
     * @param shape 形状类名称
     * @return
     */
    public abstract Shape getShape(Shape.SHAPE shape);

    /**
     * 获取颜色实例对象
     *
     * @param color 颜色类名称
     * @return
     */
    public abstract Color getColor(Color.COLOR color);

    public enum CHOICE {
        SHAPE,
        COLOR
    }
}
