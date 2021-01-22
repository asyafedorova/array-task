package com.epam.arraytask.service;

import com.epam.arraytask.model.Array;

public interface ArrayService<T> {
    T getMinElement(Array array);
    T getMaxElement(Array array);
    void replaceElement(Array array, T replaced, T replacedWith);
    T getAverageValue(Array array);
    T getArraySumOfElements(Array array);
    int getNumberOfPositiveOnes(Array array);
    int getNumberOfNegativeOnes(Array array);
}
