package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties property = new Properties();
        InputStream inputFIle = null;

        try {
            //changed line
            inputFIle = new FileInputStream("src\\resources\\config.properties");
            property.load(inputFIle);

            System.out.println(property.getProperty("db.host"));
            System.out.println(property.getProperty("db.login"));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(inputFIle != null) {
                try {
                    inputFIle.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
