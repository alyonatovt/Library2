package com.tovt;

public class Author {
   private String name;
   private int age;
  private  int bookCount;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}



