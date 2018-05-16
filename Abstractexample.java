import java.util.*;
abstract class Abstractclass
{
abstract inputStudentdetails();
abstract inputStudentmarks();
abstract int sum(int a,int b);
void studentClass()
{
	System.out.println("He is student of Class X");
}
}
public class Abstractexample extends Abstractclass
{
	Scanner sc=new Scanner(System.in);
	void inputStudentdetails()
	{
	
		System.out.println("Enter rollno,name of the student");
		int rollno=sc.nextInt();
		String name=sc.next();
		System.out.println("The rollnum is "+rollno+"Name is "+name);
	}
	void inputStudentmarks()
	{
		System.out.println("enter physics,chemistry,biology marks ");
		int physics=sc.nextInt();
		int chemistry=sc.nextInt();
		int biology=sc.nextInt();
		int total=physics+chemistry+biology;
		System.out.println("The total marks of the student is "+total);
		}
	public static void main(String[] args)
	{
	Abstractexample ab=new Abstractexample();
	ab.studentClass();
	ab.inputStudentdetails();
	ab.inputStudentmarks();
	}
}
