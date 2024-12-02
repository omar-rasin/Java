/*Write a program that reads a file using Scanner. 
Handle FileNotFoundException. */

import java.util.Scanner;
import java.io.FileNoutFoundException;
import java.io.File;

public class Qthree {
    
        public void readFile() throws FileNotFoundException {
        File file = new File("nonexistent.txt");
        Scanner scanner = new Scanner(file);
    }
    public static void main(String[] args) {
        
        Qthree example = new Qthree();
        try {
            example.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}
