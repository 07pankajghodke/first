class CalSum
{
void findSum(int ...x)
{ int sum=0;
 for(int i=0;i<x.length;i++)
  {
    sum=sum+x[i];
  }
System.out.printf("sum of all integer is%d\n",sum);
}
}
public class CalSumApp
{
public static void main(String x[])
{
  CalSum cs=new CalSum();
   cs.findSum(50,60,70,80,90);
}
}