/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Student Lab
 */
public class TestProperties {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        File fin = new File("subjects.properties");
        FileInputStream fis = new FileInputStream(fin);
        prop.load(fis);
        System.out.println(prop.getProperty("INT675"));
        System.out.println(prop.getProperty("INT601"));
        System.out.println(prop.getProperty("INT603"));
    }
}
