package org.zuxin.common.design_pattern.creational.factory_method;

import lombok.extern.slf4j.Slf4j;
import org.zuxin.common.design_pattern.creational.abstract_factory.*;

/**
 * 形状工厂类，使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午10:59
 */
@Slf4j
public class ShapeFactory extends AbstractFactory {
    public static Object getShape(Class<? extends Shape> clazz) {
        Object obj = null;

        try {
            obj = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * 获取形状实例对象
     *
     * @param shape 形状类名称
     * @return
     */
    @Override
    public Shape getShape(Shape.SHAPE shape) {
        if (shape == Shape.SHAPE.CIRCLE) {
            return new Circle();
        } else if (shape == Shape.SHAPE.RECTANGLE) {
            return new Rectangle();
        } else if (shape == Shape.SHAPE.SQUARE) {
            return new Square();
        }

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
        return null;
    }

    public static void main(String[] args) {
        Shape shape = (Shape) ShapeFactory.getShape(Circle.class);
        shape.draw();
        shape = (Shape) ShapeFactory.getShape(Rectangle.class);
        shape.draw();
        shape = (Shape) ShapeFactory.getShape(Square.class);
        shape.draw();
    }
}
