package org.zuxin.common.design_pattern.behavioral.command;

/**
 * Copyright (C) 2016 Taobao.com 淘宝（中国）软件有限公司 版权所有.
 * 商家&运营平台-运营平台
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午5:46
 */
public class BuyStock implements Order {
    /**
     * 股票操作对象
     */
    private Stock stock;

    /**
     * 构造函数
     * @param stock
     */
    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    /**
     * 订单操作
     */
    @Override
    public void execute() {
        stock.buy();
    }
}
