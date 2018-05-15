import java.util.Scanner;
class Student
{
	int rollno;
	String name,email;
	Scanner sc=new Scanner(System.in);
	
	void inputdata()
	{
	System.out.println("Enter the details of the student as Rollnum,name,email");
	rollno=sc.nextInt();
	name=sc.next();
	email=sc.next();
	}

}
class Result extends Student
{
	int m1,m2,m3;
	int total;
	float avg;
	void inputdata()
	{
	super.inputdata();
	System.out.println("Enter the marks m1 ");
	 m1=sc.nextInt();
	System.out.println("Enter the marks m2 ");
	 m2=sc.nextInt();
	System.out.println("Enter the marks m3 ");
	 m3=sc.nextInt();
     total=m1+m2+m3;
	 avg=total/3;
	}
	void display()
	{
		System.out.println("Result of the student\n");
		System.out.println("Roll Number is "+ rollno);
		System.out.println("Name is "+ name);
		System.out.println("Marks obtained in M1 " +m1+ "\nM2 is " +m2+ "\nM3 is " +m3);
		System.out.println("Total is "+ total+"\n Average is "+avg);
	}

    public static void main(String args[])
    {
	Result res=new Result();
	res.inputdata();
	res.display();
    }

}
