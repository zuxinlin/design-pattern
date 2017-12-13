package org.zuxin.common.design_pattern.creational.abstract_factory;

import org.zuxin.common.design_pattern.creational.factory_method.Shape;
import org.zuxin.common.design_pattern.creational.factory_method.ShapeFactory;

/**
 * 工厂生成器
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午11:55
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(AbstractFactory.CHOICE choice) {
        if (choice == AbstractFactory.CHOICE.COLOR) {
            return new ColorFactory();
        } else if (choice == AbstractFactory.CHOICE.SHAPE) {
            return new ShapeFactory();
        }

        return null;
    }

    public static void main(String[] args) {
        //形状工厂
        AbstractFactory abstractFactory = FactoryProducer.getFactory(AbstractFactory.CHOICE.SHAPE);
        abstractFactory.getShape(Shape.SHAPE.CIRCLE).draw();
        abstractFactory.getShape(Shape.SHAPE.RECTANGLE).draw();
        abstractFactory.getShape(Shape.SHAPE.SQUARE).draw();

        //颜色工厂
        abstractFactory = FactoryProducer.getFactory(AbstractFactory.CHOICE.COLOR);
        abstractFactory.getColor(Color.COLOR.RED).fill();
        abstractFactory.getColor(Color.COLOR.GREEN).fill();
        abstractFactory.getColor(Color.COLOR.BLUE).fill();
    }
}
