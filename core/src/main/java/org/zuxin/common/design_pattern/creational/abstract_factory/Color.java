package org.zuxin.common.design_pattern.creational.abstract_factory;

/**
 * 颜色接口类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/13 下午11:42
 */
public interface Color {
    /**
     * 填充颜色
     */
    void fill();

    enum COLOR {
        RED,
        GREEN,
        BLUE
    }
}
