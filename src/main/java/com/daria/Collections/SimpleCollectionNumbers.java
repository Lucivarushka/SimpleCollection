package com.daria.Collections;

import java.util.Iterator;

public class SimpleCollectionNumbers<Integer> {
    int[] numbers;

    public SimpleCollectionNumbers() {
        numbers = new int[0];
    }

    public boolean add(int value) {
        try {
            int[] temp = numbers;
            numbers = new int[temp.length + 1];
            System.arraycopy(temp, 0, numbers, 0, temp.length);
            numbers[numbers.length - 1] = value;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void remove(int index) {
        try {
            int[] temp = numbers;
            numbers = new int[temp.length - 1];
            System.arraycopy(temp, 0, numbers, 0, index); //копируем до индекса
            int afterIndexElements = temp.length - index - 1;
            System.arraycopy(temp, index + 1, numbers, index, afterIndexElements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int indexOf(int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i])
                return i;
        }
        return -1;
    }

    public int max() {
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        return maximum;
    }

    public int min() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (min > numbers[i]) {
                min = numbers[i];
            }
        return min;
    }

    public double avg() {
        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        return average;
    }

    public int get(int index) {
        return numbers[index];
    }

    public int size() {
        return numbers.length;
    }

    public Iterator<Integer> iterator() {
        return new SimpleIterator(numbers);
    }
}
