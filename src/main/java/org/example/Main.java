package org.example;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        printHTML(args[0], args[1]);
        printHTML(args[2], args[3]);

    }

    public static void printHTML(String url, String fileName) {
        try {
            URL urlEb =  new URL(url);
            InputStream stream = urlEb.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String inputLine = "";
            while (inputLine != null) {
                inputLine = reader.readLine();
                writer.write(inputLine);
            }

        } catch (Exception e) {

        }
    }
}