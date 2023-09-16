package com.sap.cc.bulletinboard.datastructure;

public class QuickSort {

    public QuickSort() {
    }

    public int partition(int[] arr, int low, int high) {
        // Implementation of the partition method
        // ...
        int x = low;
        int y = high;
        int z = arr[low];
        while (x < y) {
            while (x < y && arr[y] >= z) --y;
            if (x < y) arr[x++] = arr[y];
            while (x < y && arr[x] <= z) ++x;
            if (x < y) arr[y--] = arr[x];
        }
        arr[x]=z;
        return x;
    }
}
