package com.sap.cc.bulletinboard.datastructure;

public class Binarytree<T> {
    private BinarytreeNode<T> root;
    public Binarytree(){
        this.root = new BinarytreeNode<T>();
    }

    public Binarytree(BinarytreeNode<T> node){
        this.root = node;
    }

    public boolean insertLeft(T x, BinarytreeNode<T> parent){
        return false;
    }

}
