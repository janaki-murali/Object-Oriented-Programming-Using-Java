class Employee
{
    protected String name;          
    protected int age;
    protected String phno;
    protected String address;
    protected long salary;
    public Employee()               
    {
    }
    protected void printSalary()
    {
        System.out.println("Salary="+salary);
    }
}
class Officer extends Employee
{
    char specialization;
    char department;
    public Officer(String name,int age,String phno,String address,long  salary)
    {
        this.name=name;        
        this.age=age;
        this.phno=phno;
        this.address=address;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+phno);
        System.out.println("Address : "+address);
    }
}
class Manager extends Employee
{
    protected String specialization;
    protected String department;
    public Manager(String name,int age,String phno,String address,long salary,String special,String dept)
    {
        this.name=name;         
        this.age=age;
        this.phno=phno;
        this.address=address;
        this.salary=salary;
        this.specialization=special;
        this.department=dept;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+phno);
        System.out.println("Address : "+address);
        System.out.println("Salary : ");
        super.printSalary();
    }
}
public class OfficerManager
{
    public static void main(String[] args)
    {
        Officer o1=new Officer("Janaki",25,"9876543210","Aluva", 65000);
        o1.display();
        Manager m1=new Manager("Adithyan",30,"9988776655","Kottayam",150000, "AI tools","Graphics");
       m1.display();
    }
}
