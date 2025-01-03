/*To write a java program that implements a multi-threaded program which has three threads. First thread generates a random integer every 1 second. If the value is even, second thread computes the square of the
number and prints. If the value is odd the third thread will print the value of cube of the number.*/

import java.util.Random;

class Randomizer extends Thread
{
  public void run()
  {
    Random r = new Random();
    for(int i=0;i<10;i++)
    {
      int n = r.nextInt(100);
      if (n%2==0)
      {
        new Even(n).start();
      }
      else
      {
        new Odd(n).start();
      }
    }
  }
  static class Even extends Thread
  {
    private int num;
    Even(int n)
    {
      this.num = n;
    }
    public void run()
    {
      System.out.println("Square : "+(num*num));
    }
  }
  static class Odd extends Thread
  {
    private int num;
    Odd(int n)
    {
      this.num = n;
    }
    public void run()
    {
      System.out.println("Cube : "+(num*num*num));
    }
  }
}
public class multithread
{
    public static void main(String[] args) 
    {
        Randomizer rz = new Randomizer();
        rz.start();
    }
}
