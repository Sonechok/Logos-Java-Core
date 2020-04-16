package com.Alex.lesson12;

import java.util.*;

public class MyArrayList<E> {
    private Object[] arr;
    private Object[] arrCopy;
    private int size;
    private int length;

    public MyArrayList()
    {
        arr = new Object[]{};
    }

    E get(int i) {
        E e = (E)arr[i];
        return e;
    }

    public int length() {
        return arr.length;
    }

    public boolean add(E e) {
        int sizeCopy = arr.length+1;
        arrCopy = arr.clone();
        arr = new Object[sizeCopy];
        int i = 0;
        while (i<arrCopy.length){
            arr[i]=arrCopy[i];
            i++;
        }
        arr[sizeCopy-1]=e;
        return true;
    }

    public boolean remove(int index) {
        if (arr == null
                || index < 0
                || index >= arr.length) {
            return false;
        }
        arrCopy = new Object[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            arrCopy[k++] = arr[i];
        }
        int i = 0;
        arr = new Object[arr.length - 1];
        while (i<arrCopy.length){
            arr[i]=arrCopy[i];
            i++;
        }
        return true;
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
