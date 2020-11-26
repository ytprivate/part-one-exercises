package com.mycompany.classes;

public class Book {
    private String name;
    private String authors;

    public Book() {
    }

    public Book(String name, String authors) {
        this.name = name;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public String setAuthors(String authors) {
        this.authors = authors;
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}



