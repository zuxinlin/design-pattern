package org.zuxin.common.design_pattern.creational.abstract_factory;

import org.zuxin.common.design_pattern.creational.factory_method.Shape;

/**
 * 颜色工厂类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午11:45
 */
public class ColorFactory extends AbstractFactory {
    /**
     * 获取形状实例对象
     *
     * @param shape 形状类名称
     * @return
     */
    @Override
    public Shape getShape(Shape.SHAPE shape) {
        return null;
    }

    /**
     * 获取颜色实例对象
     *
     * @param color 颜色类名称
     * @return
     */
    @Override
    public Color getColor(Color.COLOR color) {
        if (color == Color.COLOR.RED) {
            return new Red();
        } else if (color == Color.COLOR.GREEN) {
            return new Green();
        } else if (color == Color.COLOR.BLUE) {
            return new Blue();
        }

        return null;
    }
}
