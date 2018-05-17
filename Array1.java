import java.util.Scanner;

public class Array1 
{	
	public static void main(String[] args) 
	{
	int a[]=new int[5];
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 numbers in to the array\n");
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("The Numbers in the array are \n");
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
		System.out.println("\n");
		sum=sum+a[i];
	}
	System.out.println("The sum of the Numbers in the array are::\n"+sum);
	}

}
