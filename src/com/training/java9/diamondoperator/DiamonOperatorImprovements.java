package com.training.java9.diamondoperator;

abstract class MyClass<T> {
    abstract T add(T num, T num2);
}

public class DiamonOperatorImprovements {

    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>() {

            @Override Integer add(Integer num, Integer num2) {
                return num + num2;
            }
        };

        System.out.println(myClass.add(100, 200));
    }
}
