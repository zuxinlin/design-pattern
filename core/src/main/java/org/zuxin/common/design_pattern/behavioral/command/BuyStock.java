package org.zuxin.common.design_pattern.behavioral.command;

/**
 * 买股票动作实现类
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
