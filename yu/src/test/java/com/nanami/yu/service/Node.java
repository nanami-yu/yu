package com.nanami.yu.service;

import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: yu
 * @description: 单链表
 * @author: nanami
 * @create: 2020-05-23 11:05
 **/

@SpringBootTest
public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    //为节点追回节点
    public Node append(Node node) {
        //当前节点
        Node currentNode = this;
        //循环向后找
        while(true) {
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下一个节点为null,当前节点已经是最后一个节点
            if(nextNode==null) {
                break;
            }
            //赋给当前节点
            currentNode = nextNode;
        }
        //把需要追回的节点追加为找到的当前节点的下一个节点
        currentNode.next=node;
        return this;
    }

}
