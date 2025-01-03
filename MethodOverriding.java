/*To write a java program to create an abstract class named Shape that contains an empty method named numberOfSides(). Provide three classes
named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method
numberOfSides() that shows the number of sides in the given geometrical structures.*/

abstract class Shape               
{
    abstract int numberOfSides();   
}
class Rectangle extends Shape
{
    private int sides=4;
    int numberOfSides()
    {
       return sides;
    }
    void display()
    {
        System.out.println("Sides of a Rectangle : "+sides);
    }
}
class Triangle extends Shape
{
    private int sides=3;
    int numberOfSides()
    {
        return sides;
    }
    void display()
    {
        System.out.println("Sides of a Triangle : "+sides);
    }
}
class Hexagon extends Shape
{
    private int sides=6;
    int numberOfSides()
    {
        return sides;
    }
    void display()
    {
        System.out.println("Sides of a Hexagon : "+sides);
    }
}
public class Abstract_Shapes
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.display();
        t.display();
        h.display();;
    } 
}
