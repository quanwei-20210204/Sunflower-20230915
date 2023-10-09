package com.sap.cc.bulletinboard.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    @Test
    void given_node_when_add_then_true() {
        LinkList<Integer> list = new LinkList<>();
        boolean result = list.add(10, 0);
        assertTrue(result);

    }

    @Test
    void given_2_when_find_then_2(){
        LinkList<Integer> list = new LinkList<>();
        list.add(1,1);
        list.add(2,2);
        list.add(3,3);

        assertEquals(2, list.find(2));
    }

    @Test
    void given_when_empty_then_true(){
        LinkList<Integer> list = new LinkList<>();
        assertTrue(list.isEmpty());
    }
}