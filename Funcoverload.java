public class funcoverload 
{
int sum(int a,int b)
{
	return a+b;
}
int sum(int a,int b,int c)
{
	return a+b+c;
}
float sum(float a,float b)
{
	return a+b;
}
public static void main(String[] args)
{
funcoverload f1= new funcoverload();
System.out.println("The sum of a & b is "+f1.sum(7, 6));
System.out.println("The sum of a & b & c is "+f1.sum(8, 5, 9));
System.out.println("The sum of float a & float b is "+f1.sum(6.5f, 5.5f));
}
}
