package com.tomato.lesson3;

public class MainTest {

    public static void main(String[] args) {
        A aB = new B();
        A aC = new C();
        B bB = new B();
        B bC = new C();
        C cC = new C();

        System.out.println("aB.sum(1,1) = " + aB.sum(1,1));
        System.out.println("bB.diff(1,2) = " + bB.diff(1,2));
        System.out.println("bC.diff(1,2) = " + bC.diff(1,2));
        System.out.println("aC.sum(1,1) = " + aC.sum(1,1));

        System.out.println("cC.mult(1,2) = " + cC.mult(1,2));



        AA ab = new BB();
        AA ac = new CC();
        BB bb = new BB();
        BB bc = new CC();
        CC cc = new CC();

        System.out.println(bb.diff(1,2));
        System.out.println(ac.diff(1,2));
    }
}
