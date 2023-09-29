package com.tovt;

public class Author {
    String name;
    int age;
    int bookCount;

    public Author(String name, int age, int bookCount) {
        this.name = name;
        this.age = age;
        this.bookCount = bookCount;
    }

    void infoAuthor() {
        System.out.println("Name:" + name + "Age:" + age);
    }

    public int getBookCount() {
     return bookCount;
    }
}

