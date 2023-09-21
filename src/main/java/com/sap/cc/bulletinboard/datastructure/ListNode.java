package com.sap.cc.bulletinboard.datastructure;

public class ListNode<T> {
    T data;
    ListNode<T> next;

    public ListNode(ListNode<T> n) {
        next=n;
    }

    public ListNode(T obj, ListNode<T> n){
        data=obj;
        next=n;
    }
}
