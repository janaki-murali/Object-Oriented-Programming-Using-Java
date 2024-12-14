import java.io.*;
public class FileWriterFileReader 
{
    public static void main(String args[]) 
    {
        try
        {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello\nWe are learning FileWriter and FileReader.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
            FileReader reader = new FileReader("output.txt");
            int character;
            while ((character = reader.read()) != -1) 
            {
                System.out.print((char) character);
            }
            reader.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("error : "+ex);
        }
    }
}
