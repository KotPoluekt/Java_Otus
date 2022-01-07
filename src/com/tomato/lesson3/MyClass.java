package com.tomato.lesson3;

public class MyClass {
    int a = 10;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass myClass = (MyClass) o;

        if (a != myClass.a) return false;
        return b == myClass.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (b ? 1 : 0);
        return result;
    }

    boolean b = true;
}
