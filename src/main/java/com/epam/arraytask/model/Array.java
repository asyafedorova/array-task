package com.epam.arraytask.model;

import com.epam.arraytask.exception.ArrayException;

import java.util.Arrays;

public class Array {
    private Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    public Array(int length) {
        if (length < 1) {
            throw new ArrayException("Array length must be more than 1");
        } else {
            this.array = new Integer[length];
        }
    }

    public int getLength() {
        return array.length;
    }

    public Integer getElement(int position) {
        if (position < 0 || position > getLength() - 1) {
            throw new ArrayException("Position of element must be more than 0 and less than length");
        } else return array[position];
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }


}
