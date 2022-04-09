package com.simon.templateMethod;

//创建一个抽象类，它的模板方法被设置为  final
public abstract class Game {
    //初始化游戏
    abstract void initialize();
    //开始游戏
    abstract void startPlay();
    //游戏结束
    abstract void endPlay();

    //模板方法
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}

class Football extends Game{

    @Override
    void initialize() {
        System.out.println("准备开始，心情愉快");
    }

    @Override
    void startPlay() {
        System.out.println("开始游戏，兴奋万分");
    }

    @Override
    void endPlay() {
        System.out.println("游戏结束，友谊第一");
    }
}