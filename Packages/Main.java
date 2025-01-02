/*Write a java programme which contain three classes A,B,Main.The class A is in package ‘packageone’ and contain a method
‘methodclassone’ that prints a message stating that it is printed from class A .Similarly class B is in ‘packagetwo’ and contain a method
‘methodclasstwo’ that print a message stating that it is printed from class B.The Main class import these classes creates their instances 
and invokes their corresponding methods.*/

public class Main
{
public static void main(String[] args)
{
packageone.A instanceA = new packageone.A();
packagetwo.B instanceB = new packagetwo.B();
instanceA.methodClassOne();
instanceB.methodClassTwo();
}
}
