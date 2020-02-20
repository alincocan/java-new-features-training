package com.training.java9.privatemethods;

public class Main {
    public static void main(String[] args) {
        PrivateMethodsInterface privateMethodsInterface = () -> "hello";

        privateMethodsInterface.publicDefaultMethod();
    }
}
