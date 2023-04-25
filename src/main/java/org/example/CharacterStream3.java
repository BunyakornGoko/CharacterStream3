package org.example;

import java.io.*;

public class CharacterStream3 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello world");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String line;
            while((line = input.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}