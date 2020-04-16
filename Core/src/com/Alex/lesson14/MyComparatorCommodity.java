package com.Alex.lesson14;

import java.util.Comparator;

public class MyComparatorCommodity{
    public static Comparator<Commodity> SORT_BY_NAME = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public static Comparator<Commodity> SORT_BY_LENGTH = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            if(o1.length==o2.length) {
                return 0;
            } else if(o1.length<o2.length){
                return -1;
            }else {
                return 1;
            }
        }
    };

    public static Comparator<Commodity> SORT_BY_WIDTH = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            if(o1.width==o2.width) {
                return 0;
            } else if(o1.width<o2.width){
                return -1;
            }else {
                return 1;
            }
        }
    };

    public static Comparator<Commodity> SORT_BY_WEIGHT = new Comparator<Commodity>() {
        @Override
        public int compare(Commodity o1, Commodity o2) {
            if(o1.weight==o2.weight) {
                return 0;
            } else if(o1.weight<o2.weight){
                return -1;
            }else {
                return 1;
            }
        }
    };

}
