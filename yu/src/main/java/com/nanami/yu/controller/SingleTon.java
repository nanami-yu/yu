package com.nanami.yu.controller;

/**
 * @program: yu
 * @description: 单例模式
 * @author: nanami
 * @create: 2020-05-18 09:11
 **/

public class SingleTon {
    //静态内部类
    private SingleTon(){}
    public static SingleTon getInstance(){
        return Inner.instance;
    }
    private static class Inner{
        private static final SingleTon instance = new SingleTon();
    }
/*    //懒汉  效率低 大部分不需要同步
    private static SingleTon instance;
    private SingleTon(){}
    public static synchronized SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }*/
/*    //饿汉  初始化加载
    private static final SingleTon instance = new SingleTon();
    private SingleTon(){}
    public static SingleTon newInstance(){
        return instance;
    }*/
}
