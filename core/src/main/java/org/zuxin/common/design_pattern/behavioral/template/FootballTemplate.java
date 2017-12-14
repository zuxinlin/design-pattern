package org.zuxin.common.design_pattern.behavioral.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 足球模板类，重写初始化、开始、结束业务逻辑
 *
 * Author： linzuxin
 * Date：   2017/12/14 下午4:15
 */
@Slf4j
public class FootballTemplate extends Game {
    /**
     * 初始化游戏
     */
    @Override
    void initialize() {
        log.info("Football game initialized! Ready to start.");
    }

    /**
     * 开始游戏
     */
    @Override
    void startPlay() {
        log.info("Football game has started! Enjoy to play it.");
    }

    /**
     * 结束游戏
     */
    @Override
    void endPlay() {
        log.info("Football game finished.");
    }
}
