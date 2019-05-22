package com.daria.Collections;

import java.util.Iterator;

public class SimpleIterator<Integer> implements Iterator {
    private int[] numbers;
    private int index = 0;

    public SimpleIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        return index < numbers.length;
    }

    @Override
    public Object next() {
        return numbers[index++];
    }
}
