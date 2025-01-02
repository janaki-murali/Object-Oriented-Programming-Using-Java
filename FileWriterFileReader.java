/*To write a java program to implement file handling with reader/writer.*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

class FileWrRe {
    public static void main(String args[]) {
        try {
            System.out.print("Enter the text to insert: ");
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            FileWriter file = new FileWriter("sample.txt");
            file.write(str);
            file.close();
            System.out.println("\nText written successfully");
        } catch (Exception e) {
            System.out.println("\nError occurred while writing to the file");
            e.printStackTrace();
        }

        try {
            char[] ch = new char[100];
            FileReader rd = new FileReader("sample.txt");
            int readChars = rd.read(ch);
            System.out.println("\n\nThe contents in the file are: \n");
            System.out.println(new String(ch, 0, readChars));
            rd.close();
        } catch (Exception e) {
            System.out.println("\nError occurred while reading the file");
            e.printStackTrace();
        }
    }
}
