package com.sap.cc.bulletinboard.datastructure;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(Node<T> n) {
        next=n;
    }

    public Node(T obj,Node<T> n){
        data=obj;
        next=n;
    }
}
