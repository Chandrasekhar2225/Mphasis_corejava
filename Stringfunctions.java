class Stringfunctions
{
 public static void main(String[] args)
 {
  String s1="Mphasis Software";
  System.out.println(s1);
  //System.out.println(s1.toUpperCase());
 // System.out.println(s1.toLowerCase());
 // System.out.println(s1.indexOf('a'));
 //System.out.println(s1.lastIndexOf('a'));
  //System.out.println(s1.substring(5));
  //System.out.println(s1.substring(5,10));
  //System.out.println(s1.startsWith("hp"));
  //System.out.println(s1.endsWith("re"));
 // System.out.println(s1.replace("Software", "soft"));
  String ss="Mphasis software,mumbai";
  System.out.println(ss);
  System.out.println(s1);
  System.out.println("The length of the String is "+ss.length());  
  char name[]=s1.toCharArray();
  int leng=name.length;
  System.out.println("The Length of the array="+leng);
  for(int i=0;i<leng;i++){
	  System.out.println(name[i]);
  }
 }}
