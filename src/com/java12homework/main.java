package com.java12homework;

public class main {
    public static void main(String[] args) {
        Book book = new Book("냄비받침", 10000, "노랑", "A248SFN");
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getColor());
        System.out.println(book.getIsbn());
    }
}
