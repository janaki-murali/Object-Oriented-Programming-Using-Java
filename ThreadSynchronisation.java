/*This code demonstrates thread synchronization in Java using the synchronized keyword. It ensures that multiple threads can safely access a shared resource (in this case, the Display object) 
without causing data inconsistency or race conditions.*/

class Display
{
  public synchronised void Print(String msg)
  {
    System.out.print("[" + msg);
    try
    {
      Thread.sleep(100);
    }
    catch(InterruptedException e)
    {
      System.out.println(e.getMessage());
    }
    System.out.println("]");
  }
}
class SyncThread extends Thread
{
  private Display d;
  private String msg;
  SyncThread(Display d, String msg)
  {
    this.msg = msg;
  }
  public void run()
  {
    d.Print(msg);
  }
}
public class Synchronise
{
  public static void main(String[] args)
  {
    Display d = new Display();
    SyncThread sc = new SyncThread("Hello");
    SyncThread sd = new SyncThread("world");
    sc.start();
    sd.start();
  }
}
