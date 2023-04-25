package org.example;

import java.io.*;
import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args) {
      InputStreamReader in = new InputStreamReader(System.in);
      BufferedReader input = new BufferedReader(in);
        try {
            System.out.print("Enter name: ");
            String name = input.readLine();
            System.out.println(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
