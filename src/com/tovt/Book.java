package com.tovt;

public class Book {
     String title;
     int year;
     String author;
     double priceInShop;

    public Book(String title, int year, String author, double priceInShop) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.priceInShop = priceInShop;
    }

     void infoBook(){
    System.out.println("Book:" + title +" " + "year:" + year +" "+ "Author:" + author);
}

    public double getPriceInShop() {
        return priceInShop;
    }
}
