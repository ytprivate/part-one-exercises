package com.mycompany.classes;


import java.util.Arrays;
import java.util.Comparator;

public class BookSelector {

    public static void main(String[] args) {


        String[][] booksSelect = {
                {"111", "Angels & Demons", "Dan Brown", "Atria Books", "2003", "572", "4.69", "Hardcover"},
                {"112", "The Lost Symbol", "Dan Brown", "Knopf Doubleday Publishing Group", "2009", "528", "6.79", "Hardcover"},
                {"113", "The Da Vinci Code", "Dan Brown", "Knopf Doubleday Publishing Group", "2003", "464", "4.69", "Hardcover"},
                {"114", "Inferno", "Dan Brown", "Knopf Doubleday Publishing Group", "2013", "480", "4.69", "Hardcover"},
                {"115", "Origin", "Dan Brown", "Knopf Doubleday Publishing Group", "2017", "480", "4.69", "Hardcover"},
                {"116", "The Moneychangers", "Arthur Hailey", "Knopf Doubleday Publishing Group", "1975", "480", "4.69", "Hardcover"},
                {"117", "The Final Diagnosis", "Arthur Hailey", "Random House Publishing Group", "1981", "320", "21.49", "Hardcover"},
                {"118", "Airport", "Arthur Hailey", "Knopf Doubleday Publishing Group", "1968", "440", "4.19", "Hardcover"},
                {"119", "Wheels", "Arthur Hailey", "Doubleday and Co.", "1971", "374", "5.49", "Hardcover"},
                {"120", "Hotel", "Arthur Hailey", "The Doubleday Religious Publishing Group", "1964", "346", "6.99", "Hardcover"},
                {"121", "Death on the Nile", "Agatha Christie", "HarperCollins Publishers", "2001", "256", "9.24", "Paperback"},
                {"122", "The Body in the Library", "Agatha Christie", "HarperCollins Publishers", "2017", "224", "8.82", "Paperback"},
                {"123", "The Big Sleep", "Raymond Chandler", "Penguin Books Ltd", "2011", "256", "5.98", "Paperback"}
        };

        Book book = new Book();
        String currentAuthor = book.setAuthors("Ch");
        System.out.println(" ->Книги автора(-ов) (вхождение):  " + " ->' " + currentAuthor + " '");

        for (int i = 0; i < booksSelect.length; i++) {
            if (booksSelect[i][2].contains(currentAuthor)) {
                for (int j = 0; j < booksSelect[i].length; j++) {
                }
                System.out.println(booksSelect[i][2] + ";  " + booksSelect[i][1]);
            }
        }


        BookShop bookPublish = new BookShop();
        String publishName = bookPublish.setPublishingName("ouble");
        System.out.println("\n ->Книги издательства (вхождение): " + " ->' " + publishName + " '");

        for (int i = 0; i < booksSelect.length; i++) {
            if (booksSelect[i][3].contains(publishName)) {
                for (int j = 0; j < booksSelect[i].length; j++) {
                }
                System.out.println(booksSelect[i][3] + " ;  " + booksSelect[i][2] +
                        " ;  " + booksSelect[i][1] + " ;  " + booksSelect[i][4]);
            }
        }

        Arrays.sort(booksSelect, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return (Integer.valueOf(o1[4]).compareTo(Integer.valueOf(o2[4])));
            }
        });

        String publishYear = bookPublish.setPublishingYear("2003");
        System.out.println("\n ->Книги изданы после  " + " ->' " + publishYear + " 'года");

        int yearAfter = 0;
        for (int i = 0; i < booksSelect.length; i++) {

            String yearOfPublishing = booksSelect[i][4];
            String nameOfPublishing = booksSelect[i][3];
            String nameOfAuthors = booksSelect[i][2];
            String nameOfBook = booksSelect[i][1];
            try {
                yearAfter = Integer.parseUnsignedInt(publishYear);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод числа.");
                System.exit(0);
            }

            if (Integer.parseUnsignedInt(yearOfPublishing) > yearAfter) {
                for (int j = 0; j < booksSelect[i].length; j++) {
                }
                System.out.println(yearOfPublishing + " ;  " + nameOfPublishing +
                        " ;  " + nameOfAuthors + " ;  " + nameOfBook);
            }
        }
    }
}



