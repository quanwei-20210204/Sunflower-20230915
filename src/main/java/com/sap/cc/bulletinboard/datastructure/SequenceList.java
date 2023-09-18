package com.sap.cc.bulletinboard.datastructure;

/**
 * Data structure practice guided by Zhou, Kaiak
 * @param <T>
 */

public class SequenceList<T> {


    final int maxSize = 10;
    private T[] listArray;
    private int length;


    public SequenceList() {
        length=0;
        listArray=(T[])new Object[maxSize];
    }

    public SequenceList(int n) {
        if(n<=0){
            System.out.println("error");
            System.exit(1);
        }
        length=0;
        listArray=(T[])new Object[n];
    }

    /**
     * add()
     * @param obj
     * @param pos
     * @return
     */

    public boolean add(T obj, int pos) {
        if(pos<1||pos>length+1){
            System.out.println("pos invalid");
            return false;
        }
        if(length==listArray.length){
            T[] p=(T[])new Object[length*2];
            for(int i=0;i<length;i++){
                p[i]=listArray[i];
            }
            listArray=p;
        }
        for(int i=length;i>=pos;i--)
            listArray[i]=listArray[i-1];
        listArray[pos-1]=obj;
        length++;
        return true;
    }

    public T remove(int pos){
        T x=listArray[pos-1];
        for(int i=pos;i<=length;i++)
            listArray[i-1]=listArray[i];
        length--;
        return x;
    }

}