package com.tomato.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] values = getInts();

        ArrayExample(values);

        int[][] newArray = new int[1][1];

        System.out.println(newArray);

        int a = 10;

        int[] a2 = new int[10];

        String s1 = "111";

        s1.length();

        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(0);
        listOfInteger.add(1);

        System.out.println(listOfInteger);
        System.out.println(getTheFirstElement(listOfInteger));
    }

    private static int[] getInts() {
        int values[] = new int[]{1, 1, 1, 2, 3, 4, 5, 8, 9};
        return values;
    }

    private static void ArrayExample(int[] values) {
        System.out.println(Arrays.binarySearch(values, 1));
    }

    public static <T> T getTheFirstElement(List<T> list) {
        return list.get(0);
    }
}
