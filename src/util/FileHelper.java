package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class FileHelper {
    public static List<String> slurp(String filePath) {
        List<String> contents = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader(filePath));
            for(String line = input.readLine(); line != null; line = input.readLine()) {
                contents.add(line);
            }
            input.close();
        } catch(IOException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
        return contents;
    }

    public static void spit(String filename, List<String> contents, boolean append) {
        if (Files.notExists(Paths.get(filename))) {
            try {
                Files.createFile(Paths.get(filename));
                Files.write(Paths.get(filename), contents);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if (append) {
                try {
                    Files.readAllLines(Paths.get(filename));
                    Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(filename);
            System.out.println(contents);
        }
    }

    public static void spit(String filename, List<String> contents) {
        spit(filename, contents, false);
    }
}

