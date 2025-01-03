/*The given program defines custom exceptions (EvenException and OddException) to indicate whether a number is even or odd. It also contains a method checknum(), 
that determines if a given number is even or odd and throws the respective exception.*/

class EvenException extends Exception
{
    public String toString()
    {
       return "Even Number";
    }
}
class OddException extends Exception
{
    public String toString()
    {
        return "Odd Number";
    }
}
public class ExceptionHandling 
{
    public static void checknum(int n) throws EvenException,OddException
    {
        if (n%2==0)
        {
            throw new EvenException();
        }
        else
        {
            throw new OddException();
        }
    }
    public static void main(String[] args)
    {
        int num=2;
        try
        {
            Pgm10.checknum(num/0);
        }
        catch(EvenException even)
        {
            System.out.println("Exception : "+even);
        }
        catch (OddException odd)
        {
            System.out.println("Exception : "+odd);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }    
}
