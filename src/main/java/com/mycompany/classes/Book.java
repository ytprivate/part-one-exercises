package main.java.com.mycompany.classes;

import java.util.Objects;

public class Book {

    private final int id;
    private final String bookName;
    private final String bookAuthors;
    private final String publishingName;
    private final int publishingYear;
    private final int pageCount;
    private double price;
    private final String bindingType;

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

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookOfAuthors() {
        return bookAuthors;
    }

    public String getPublishingName() {
        return publishingName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor(s)='" + bookAuthors + '\'' +
                ", publishingName='" + publishingName + '\'' +
                ", publishingYear=" + publishingYear +
                ", pages=" + pageCount +
                ", price=" + price +
                ", binding='" + bindingType + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() && getPublishingYear() == book.getPublishingYear()
                && getBookName().equals(book.getBookName()) && bookAuthors.equals(book.bookAuthors)
                && getPublishingName().equals(book.getPublishingName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBookName(), bookAuthors, getPublishingName(), getPublishingYear());
    }

    public String addingInfo() {
        return ("Id:" + getId() + ", pages:" + getPageCount() + ", price:" + getPrice() + ", binding:" + getBindingType());
    }

    String getAuthorsInfo() {
        return (getBookOfAuthors() + " ; " + getBookName() + ", " + getPublishingName() + ", " + getPublishingYear()
                + ", " + addingInfo());
    }

    String getPublishingInfo() {
        return (getPublishingName() + " ; " + getPublishingYear() + ", " + getBookOfAuthors() + ", " + getBookName()
                + ", " + addingInfo());
    }

    String getYearInfo() {
        return (getPublishingYear() + " ; " + getPublishingName() + ", " + getBookOfAuthors() + ", " + getBookName()
                + ", " + addingInfo());
    }

    public void getBooksListOfAuthors(String authors) {
        if (getBookOfAuthors().contains(authors)) {
            System.out.println(getAuthorsInfo());
        }
    }

    public void getBookListOfPublishingHouse(String publisher) {
        if (getPublishingName().contains(publisher)) {
            System.out.println(getPublishingInfo());
        }
    }

    public void getBookListSinceYear(int sinceYear) {
        if (getPublishingYear() >= sinceYear) {
            System.out.println(getYearInfo());
        }
    }
}
