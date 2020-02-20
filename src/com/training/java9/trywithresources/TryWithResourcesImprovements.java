package com.training.java9.trywithresources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesImprovements {

    public static void main(String[] args) throws IOException {
        java8Example();
        java9Example();
    }

    private static void java8Example() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(""));

        try (BufferedInputStream bufferedInputStream1 = bufferedInputStream) {
            bufferedInputStream1.read();
        }
    }

    private static void java9Example() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(""));

        try (bufferedInputStream) {
            bufferedInputStream.read();
        }
    }
}
