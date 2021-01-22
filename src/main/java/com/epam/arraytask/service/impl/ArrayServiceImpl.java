package com.epam.arraytask.service.impl;

import com.epam.arraytask.model.Array;
import com.epam.arraytask.service.ArrayService;

public class ArrayServiceImpl implements ArrayService<Integer> {
    public Integer getMinElement(Array array) {
        Integer minIndex = 0;
        Integer min = array.getElement(minIndex);
        for(int i = 1; i < array.getLength(); i++) {
            if (array.getElement(i) < min) {
                min = array.getElement(i);
                minIndex = i;
            }
        }
        return array.getElement(minIndex);
    }

    public Integer getMaxElement(Array array) {
        return null;
    }

    public void replaceElement(Array array, Integer replaced, Integer replacedWith) {

    }

    public Integer getAverageValue(Array array) {
        return null;
    }

    public Integer getArraySumOfElements(Array array) {
        return null;
    }

    public int getNumberOfPositiveOnes(Array array) {
        return 0;
    }

    public int getNumberOfNegativeOnes(Array array) {
        return 0;
    }
}
