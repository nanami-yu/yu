package com.nanami.yu.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: yu
 * @description: 测试
 * @author: nanami
 * @create: 2020-05-11 14:10
 **/

class YeYe{
    Map a = new  HashMap();
    static {
        System.out.println("YeYe静态代码块");
    }
}

class Father extends YeYe{
    public final static String strFather="HelloJVM_Father";

    static{
        System.out.println("Father静态代码块");
    }
}

class Son extends Father{
    public static String strSon="HelloJVM_Son";

    static{
        System.out.println("Son静态代码块");
    }
}

public class test {
    public static void main(String[] args) {
        //System.out.println(Son.strFather);
/*        //创建自定义线程对象
        MyThread mt = new MyThread("新的线程！");
        //开启新线程
        mt.start();
        //在主方法中执行for循环
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！"+i);
        }*/
        RunableDemo runn=new RunableDemo();
        Thread thread=new Thread(runn);
        thread.start();

        int a = 1;
        while (a<4){
            //Thread.currentThread().getName()为获取当前线程的名字
            System.out.println(Thread.currentThread().getName()+ a);
            a++;
        }

    }
}
