package com.may17;

public class Constructorexample
{
int empno;
String name,address;
Constructorexample(int empno,String name,String address)
{
	this.empno=empno;
	this.name=name;
	this.address=address;
}
void display()
{
	System.out.println("Empno is "+empno+"\nName is "+name+"\nAddress is " +address);
}


}
public class Constructorexample1 extends Constructorexample
{
int salary;
String Designation;

Constructorexample1(int empno,String name,String address,int salary,String Designation)
{
	super(empno,name,address);
	this.salary=salary;
	this.Designation=Designation;
}
void display()
{
	super.display();
	System.out.println("\nSalary is "+salary+"\nDesignation is "+Designation);
}
public static void main(String[] args)
{
	Constructorexample1 ob=new Constructorexample1(501,"chandu","Bangalore",50000,"Software Engineer");
	ob.display();
}
}
