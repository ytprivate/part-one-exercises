package main.java.learn.collections;

import java.io.*;
import java.util.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {

        ArrayList<String> text = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(
                    "./src/main/java/collections/text.txt"));
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
            File file = new File("./src/main/java/collections/writefile.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(text));
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
