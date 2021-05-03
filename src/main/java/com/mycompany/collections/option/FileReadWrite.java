package com.mycompany.collections.option;

import java.io.*;
import java.util.*;

//import static java.util.Objects.requireNonNull;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {

        ArrayList<String> text = new ArrayList<>();
//        new File(".").getAbsolutePath();
        System.out.println(new File(".").getAbsolutePath());
        try {
            Scanner sc = new Scanner(new File(
                    Objects.requireNonNull(FileReadWrite.class.getClassLoader().getResource("text.txt")).getPath()));
//                    Objects.requireNonNull(FileReadWrite.class.getClassLoader().getResource("text.txt")).getPath()));
            while (sc.hasNext()) {
                text.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(text);
        Collections.reverse(text);
        System.out.println(text);

        try {
            File file = new File(
                    Objects.requireNonNull(FileReadWrite.class.getClassLoader().getResource("writefile.txt")).getPath());
            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(text));
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}