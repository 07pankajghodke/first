import java.util.*;

public class ArrayApp
{
 public static void main(String x[])
 {
   Scanner abc=new Scanner(System.in);
	 int size,i;   
      
	System.out.println("Enter the Size of Array");
 	 size=abc.nextInt();

	int a[]=new int [size];
    
  	  System.out.println("Enter the Element in Array");
     
	for(i=0;i<a.length;i++)
	{
           a[i]=abc.nextInt();
	}

   System.out.println("display value of array");
   for(i=0;i<a.length;i++)
   {
     System.out.println(a[i]);
   }
 }

}