/*To write a java program that read from a file and write to file by handling all file related exceptions.*/

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;

classfilecrwrre
{
    public static void main(String args[])
    {
        Scanners = new Scanner(System.in);
        try
        {
            System.out.print("Enter file Name : ");
            String filename = s.nextLine();
            File create = new File(filename);
            if(create.createNewFile())
            {
                System.out.println("File creates succesfully"+create.getName());
            }
            else
            {
                System.out.println("File already Exist");
            }
        }
        catch (Exception e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try
        {
            System.out.print("\nEnter the text to insert : ");
            String str = s.nextLine();
            FileWriter file = new FileWriter("filename");
            file.write(str);
            file.close();
            System.out.print("\nText writted succesfully");
        }
        catch(Exception e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try
        {
            System.out.print("\nError occurred");
            e.printStackTrace();
            char ch[] = new char[100];
            FileReader rd = new FileReader("filename");
            rd.read(ch);
            System.out.println("\n\nThe contents in the file is \n");
            System.out.println(ch);
            rd.close();
        }
        catch(Exception e)
        {
            System.out.print("\nError occurred");
            e.printStackTrace();
        }
    }
}
