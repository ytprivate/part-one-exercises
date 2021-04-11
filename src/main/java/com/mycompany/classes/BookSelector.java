package main.java.com.mycompany.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookSelector {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book(111, "Angels & Demons", "Dan Brown", "Atria Books", 2003, 572, 4.69, "Hardcover"));
        bookList.add(new Book(112, "The Lost Symbol", "Dan Brown", "Knopf Doubleday Publishing Group", 2009, 528, 6.79, "Hardcover"));
        bookList.add(new Book(113, "The Da Vinci Code", "Dan Brown", "Knopf Doubleday Publishing Group", 2003, 464, 4.69, "Hardcover"));
        bookList.add(new Book(114, "Inferno", "Dan Brown", "Knopf Doubleday Publishing Group", 2013, 480, 4.69, "Hardcover"));
        bookList.add(new Book(115, "Origin", "Dan Brown", "Knopf Doubleday Publishing Group", 2017, 480, 4.69, "Hardcover"));
        bookList.add(new Book(116, "The Moneychangers", "Arthur Hailey", "Knopf Doubleday Publishing Group", 1975, 480, 4.69, "Hardcover"));
        bookList.add(new Book(117, "The Final Diagnosis", "Arthur Hailey", "Random House Publishing Group", 1981, 320, 21.49, "Hardcover"));
        bookList.add(new Book(118, "Airport", "Arthur Hailey", "Knopf Doubleday Publishing Group", 1968, 440, 4.19, "Hardcover"));
        bookList.add(new Book(119, "Wheels", "Arthur Hailey", "Doubleday and Co.", 1971, 374, 5.49, "Hardcover"));
        bookList.add(new Book(120, "Hotel", "Arthur Hailey", "The Doubleday Religious Publishing Group", 1964, 346, 6.99, "Hardcover"));
        bookList.add(new Book(121, "Death on the Nile", "Agatha Christie", "HarperCollins Publishers", 2001, 256, 9.24, "Paperback"));
        bookList.add(new Book(122, "The Body in the Library", "Agatha Christie", "HarperCollins Publishers", 2017, 224, 8.82, "Paperback"));
        bookList.add(new Book(123, "The Big Sleep", "Raymond Chandler", "Penguin Books Ltd", 2011, 256, 5.98, "Paperback"));

        System.out.println("\nOriginal Book List\n" + bookList);

        bookList.sort(Comparator.comparing(Book::getBookOfAuthors));
        System.out.println("--------------");
        String authors = "ha";
        System.out.println("Книги автора(-ов) - вхождение : " + " \" " + authors + " \"");
        for (Book bookSelect : bookList) {
            bookSelect.getBooksListOfAuthors(authors);
        }

        bookList.sort(Comparator.comparing(Book::getPublishingName));
        System.out.println("--------------");
        String publisher = "Boo";
        System.out.println("Книги напечатаны издательством - вхождение :" + " \" " + publisher + " \"");
        for (Book bookSelect : bookList) {
            bookSelect.getBookListOfPublishingHouse(publisher);
        }

        bookList.sort(Comparator.comparing(Book::getPublishingYear));
        System.out.println("--------------");
        int sinceYear = 2003;
        System.out.println("Книги изданы после " + sinceYear + " года включительно :");
        for (Book bookSelect : bookList) {
            bookSelect.getBookListSinceYear(sinceYear);
        }
    }
}
