package com.tomato.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGeneric {

    public static void main(String[] args) {
        GenericClass<Integer> class1 = new GenericClass<>(0);
        GenericClass<String> class2 = new GenericClass<>("11122");

        System.out.println(class1.getValue());
        System.out.println(class2.getValue());
    }
}
