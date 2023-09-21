package com.sap.cc.bulletinboard.datastructure;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BinarytreeNodeTest {

    @Test
    public void given_when_node_then_success(){
        BinarytreeNode<Integer> binarytreeNode = new BinarytreeNode(5);
        Assertions.assertNotNull(binarytreeNode);
    }


}