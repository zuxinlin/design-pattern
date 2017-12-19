package org.zuxin.common.design_pattern.behavioral.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 股票类
 * <p/>
 * Author： linzuxin
 * Date：   2017/12/14 下午5:46
 */
@Data
@Slf4j
public class Stock {
    /**
     * 股票名称
     */
    private String name;

    /**
     * 股票数量
     */
    private int quantity;

    public void buy() {
        log.info("buy {} stocks named {}", quantity, name);
    }

    public void sell() {
        log.info("sell {} stocks named {}", quantity, name);
    }
}
