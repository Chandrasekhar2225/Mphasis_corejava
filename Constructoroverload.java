public class Constructoroverload 
{
	Constructoroverload ()
	{
		System.out.println("This is Default Constructor");
	}
	Constructoroverload (int a,int b)
	{
		System.out.println("The sum of a & b is "+(a+b));
	}
	int sum(int a,int b)
	{
		return (a+b);
	}
	public static void main(String[] args) 
	{
	Constructoroverload ob= new Constructoroverload();
	Constructoroverload ob1= new Constructoroverload(8,9);
	Constructoroverload ob2= new Constructoroverload(38,62);
	System.out.println("the sum function is "+ob.sum(10,60));
	}
	
}
