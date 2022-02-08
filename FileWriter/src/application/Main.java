package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //FileWriter(path) - create/recreate
        //FileWriter(path, true) - att/increase

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
