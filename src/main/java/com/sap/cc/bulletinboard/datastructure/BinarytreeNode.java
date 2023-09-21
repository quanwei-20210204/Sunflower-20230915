package com.sap.cc.bulletinboard.datastructure;

public class BinarytreeNode<T>{
    public BinarytreeNode<T> lChild;
    private T data;
    public BinarytreeNode<T> rChild;
    public BinarytreeNode(){

    }

    public BinarytreeNode(T x){
        data = x;
        lChild = null;
        rChild = null;
    }
}
