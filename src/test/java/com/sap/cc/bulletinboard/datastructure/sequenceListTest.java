package com.sap.cc.bulletinboard.datastructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SequenceListTest {

    @Test
    void given_one_when_add_then_success() {
        SequenceList<Integer> list = new SequenceList<>();
        assertTrue(list.add(1, 1));

    }
}