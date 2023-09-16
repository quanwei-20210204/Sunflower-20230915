package com.sap.cc.bulletinboard.datastructure;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void given_arr_when_partition_then_position() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 2, 9, 1, 7};
        int low = 0;
        int high = arr.length - 1;

        int pivotIndex = quickSort.partition(arr, low, high);

        Assert.assertEquals(2, pivotIndex);

        for (int i = low; i < pivotIndex; i++) {
            Assert.assertTrue(arr[i] <= arr[pivotIndex]);
        }

        for (int j = high;  j> pivotIndex; j--){
            Assert.assertTrue(arr[j] >= arr[pivotIndex]);
        }

    }
}