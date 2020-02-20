package com.training.java9.privatemethods;

public interface PrivateMethodsInterface {

    private static String privateStaticMethod() {
        return "Hello, I am a static method";
    }

    private String privateDefaultMethod() {
        return "Hello, I am a private method";
    }

    default void publicDefaultMethod() {
        System.out.println(privateDefaultMethod());
        System.out.println(privateStaticMethod());
    }

    String publicMethod();
}
