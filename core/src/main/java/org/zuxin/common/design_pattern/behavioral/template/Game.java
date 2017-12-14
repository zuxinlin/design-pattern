package org.zuxin.common.design_pattern.behavioral.template;

/**
 * 游戏抽象类，定义了公共模板方法，定义了抽象方法
 *
 * Author： linzuxin
 * Date：   2017/12/14 下午4:11
 */
public abstract class Game {
    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模板方法，封装了玩游戏的整个过程。设置为final，防止被更改流程。
     */
    final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    public static void main(String[] args) {
        Game game = new BasketballTemplate();
        game.play();

        game = new FootballTemplate();
        game.play();
    }
}
