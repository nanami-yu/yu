package com.nanami.yu.service;

/**
 * @program: yu
 * @description:
 * @author: nanami
 * @create: 2020-05-25 12:51
 **/

public class otherTest {
    public static void main(String[] args) {
        hua:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (i == 2) {
                    break hua;
                }

            }
        }
    }

}
