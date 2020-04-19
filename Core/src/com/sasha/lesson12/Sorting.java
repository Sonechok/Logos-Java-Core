package com.sasha.lesson12;

public class Sorting {
    public static void bubbleSort(Integer[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] < arr[j+1] ){
                Integer tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
}
