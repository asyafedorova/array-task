package com.epam.arraytask.service.impl;

import com.epam.arraytask.model.Array;
import com.epam.arraytask.service.ArrayService;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ArrayServiceImplTest {
    private Array testArray = new Array(new Integer[]{1, 2, 3, 4, 0});
    private ArrayService arrayService = new ArrayServiceImpl();

    @Test
    public void testGetMinElement() {
        Assert.assertEquals(arrayService.getMinElement(testArray), 0);
    }

    @Test
    public void testGetMaxElement() {
    }

    @Test
    public void testReplaceElement() {
    }

    @Test
    public void testGetAverageValue() {
    }

    @Test
    public void testGetArraySumOfElements() {
    }

    @Test
    public void testGetNumberOfPositiveOnes() {
    }

    @Test
    public void testGetNumberOfNegativeOnes() {
    }
}