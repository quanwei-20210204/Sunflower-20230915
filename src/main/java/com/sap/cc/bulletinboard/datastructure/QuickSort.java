package com.sap.cc.bulletinboard.datastructure;

public class QuickSort {

    public QuickSort() {
    }

    public int partition(int[] arr, int low, int high) {
        // Implementation of the partition method
        // ...
        int x_low = low;
        int y_high = high;
        int z_pivot = arr[low];
        while (x_low < y_high) {
            while (x_low < y_high && arr[y_high] >= z_pivot) --y_high;
            if (x_low < y_high) arr[x_low++] = arr[y_high];
            while (x_low < y_high && arr[x_low] <= z_pivot) ++x_low;
            if (x_low < y_high) arr[y_high--] = arr[x_low];
        }
        arr[x_low]=z_pivot;
        return x_low;
    }
}
