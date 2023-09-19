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

    @Test
    void given_2_when_remove_then_return_2() {
        SequenceList<Integer> list = new SequenceList<>();
        list.add(1,1);
        list.add(2,2);
        list.add(3,3);
        list.add(4,4);

        int removedElement = list.remove(2);

        assertEquals(2, removedElement);

    }

    @Test
    public void given_2_when_find_then_2() {
        SequenceList<Integer> list = new SequenceList<>();
        list.add(1,1);
        list.add(2,2);
        int index = list.find(2);
        assertEquals(2, index);
    }
}