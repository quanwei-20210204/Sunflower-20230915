package com.sap.cc.bulletinboard.interview;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SumOfNTest {
    @Test
    public void testCalculateSum() {
        SumOfN sumOfN = new SumOfN();
        int n = 10;
        int expectedSum = 55;
        int actualSum = sumOfN.calculateSum(n);
        Assert.assertEquals(expectedSum, actualSum);
    }
}
