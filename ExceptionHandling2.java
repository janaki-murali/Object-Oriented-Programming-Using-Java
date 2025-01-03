/*To write a java program to give the result of division of two numbers that shows the usage of try, catch, throws and finally.*/

import java.util.Scanner;

public class trycatch
{
  public static void main(String args[])
  {
    try
    {
      System.out.print("Enter two numbers to divide : ");
      Scanner s=new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      float ans = (float)a/b;
      System.out.println("Result is : "+ans);
    }
    catch(ArithmeticException e)
    {
      System.out.print(e.getMessage());
    }
    finally
    {
      System.out.println("Operation ended");
    }
  }
}
