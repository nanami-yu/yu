package com.nanami.yu.controller;

/**
 * @program: yu
 * @description: 实现Runable
 * @author: nanami
 * @create: 2020-05-18 10:03
 **/

public class RunableDemo implements Runnable{

    @Override
    public void run() {
        int a = 1;
        while (a<4){
            System.out.println(Thread.currentThread().getName()+ a);//Thread.currentThread().getName()为获取当前线程的名字
            a++;
        }
    }
}
