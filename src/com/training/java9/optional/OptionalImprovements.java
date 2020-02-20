package com.training.java9.optional;

import java.util.Optional;

public class OptionalImprovements {

    public static void main(String[] args) {
        streamMethod();
        ifPresentOrElseMethod();
    }


    private static void streamMethod() {
        Author author = new Author("Ted", 56);

        Optional<Author> optionalAuthor = Optional.ofNullable(author);

        System.out.println(optionalAuthor.stream().anyMatch(result -> result.getName().equals("Ted")));
    }

    private static void ifPresentOrElseMethod() {
        Author author = new Author("Ted", 56);

        Optional.of(author).ifPresentOrElse(
            (author1) -> System.out.println(author1 + ""),
            () -> System.out.println("Not found")
        );
    }

    private static void orMethod() {
        Author author = new Author("Ted", 56);

        Optional.of(author).or(() -> Optional.of(new Author("AnotherAuthor", 23)));
    }

}
class Author {
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}