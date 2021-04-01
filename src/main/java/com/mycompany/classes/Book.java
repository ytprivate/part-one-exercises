package com.mycompany.classes;

import java.util.Objects;

public class Book {

    private int id;
    private String bookName;
    private String bookAuthors;
    private String publishingName;
    private int publishingYear;
    private int pageCount;
    private double price;
    private String bindingType;

    public Book(int id, String bookName, String bookAuthors, String publishingName, int publishingYear,
                int pageCount, double price, String bindingType) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthors = bookAuthors;
        this.publishingName = publishingName;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.price = price;
        this.bindingType = bindingType;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookOfAuthors() {
        return bookAuthors;
    }

    public void getBookOfAuthors(String bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public String getPublishingName() {
        return publishingName;
    }

    public void setPublishingName(String publishingName) {
        this.publishingName = publishingName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    String getInfo() {
        return (getBookName() + ", " + getBookOfAuthors() + ", " + getPublishingName() + ", " + getPublishingYear()
                + ", " + getPageCount() + ", " + getPrice() + ", " + getBindingType());
    }

    public void printInfo() {
        String info = getInfo();
        System.out.println(info);
    }

    public void getBookListSinceYear(int sinceYear) {
        if (getPublishingYear() >= sinceYear) {
            System.out.println(getInfo());
        }
    }


    public void getBooksListOfAuthors(String authors) {
        if (getBookOfAuthors().contains(authors)) {
            System.out.println(getInfo());
        }
    }


    public void getBookListOfPublishingHouse(String publisher) {
        if (getPublishingName().contains(publisher)) {
            System.out.println(getInfo());
        }
    }
}

