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
}