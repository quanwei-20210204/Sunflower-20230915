package com.sap.cc.bulletinboard.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarytreeTest {

    @Test
    void given_when_constructor_then_okay(){
        Binarytree<Integer> bt = new Binarytree<>();
        Assertions.assertNotNull(bt);
    }

    @Test
    void given_when_constructor_with_parameter_then_okay(){
        BinarytreeNode<Integer> node = new BinarytreeNode<>(5);
        Binarytree<Integer> bt = new Binarytree<>(node);
        Assertions.assertNotNull(bt);

//        assertEquals(Integer.valueOf(5), bt.getRoot().getData());
//        assertNull(bt.getRoot().getLeft());

    }

    @Test
    void testInsertLeft(){
        BinarytreeNode<Integer> root = new BinarytreeNode<>(5);
        Binarytree<Integer> tree = new Binarytree<>(root);
        boolean result = tree.insertLeft(2,root);
        assertTrue(result);
    }

}