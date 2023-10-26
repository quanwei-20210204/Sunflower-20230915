package com.sap.cc.bulletinboard.interview;

public class SumOfN {
    public int calculateSum(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
}
