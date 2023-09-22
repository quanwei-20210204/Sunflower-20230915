package com.sap.cc.bulletinboard.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarytreeTest {

    @Test
    void given_when_constructor_then_okay(){
        Binarytree bt = new Binarytree();
        Assertions.assertNotNull(bt);
    }

}