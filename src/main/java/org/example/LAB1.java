package org.example;

import java.io.*;

public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello world");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            while((ch=input.read())!= -1){
                System.out.println((char)ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
