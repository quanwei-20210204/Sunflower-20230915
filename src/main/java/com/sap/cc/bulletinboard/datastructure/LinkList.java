package com.sap.cc.bulletinboard.datastructure;

public class LinkList<T> {
    private ListNode<T> head;
    private int length;
    public LinkList(){
        length=0;
        head=new ListNode<T>(null);
    }
    public boolean add(T obj,int pos){
        int num=1;
        ListNode<T> p=head,q=head.next;
        while(num<pos){
            p=q;
            q=q.next;
            num++;
        }
        p.next=new ListNode<T>(obj,q);
        length++;
        return true;
    }
}

