package com.tovt;

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Holly Black", 51, 44);
        Author author2 = new Author("Stephen Edwin King", 75, 264);
        Author author3 = new Author("Dan Brown", 58, 8);

        Book book1 = new Book("The Cruel Prince", 2018, "Holly Black",150.0);
        Book book2 = new Book("Carrie", 1974, "Stephen Edwin King",450.0);
        Book book3 = new Book("The Da Vinci Code", 2003, "Dan Brown ",230.0);

        Student student1= new Student("Alyona","Tovt",18,"KN-23");
        Student student2= new Student("Vanessa","Yezerska",17,"KN-23");
        Student student3 = new Student("Olesia","Myskiv",17,"KN-23");


        book1.infoBook();
        System.out.println("Ціна в онлайн магазині: " + " " + book1.priceInShop);
        author1.infoAuthor();
        System.out.println("Кількість книжок написаних за все життя:" + " "+ author1.bookCount);
        student2.infoStudent();
        System.out.println("Вік студента:" + " " + student2.age);
        }
    }


