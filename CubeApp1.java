class cube
{ int no;
  void setvalue(int x)
   {
     no=x;
   }
   int getcube()
   {
    return no*no*no;
   }
  
}
public class CubeApp1
{
 public static void main(String x[])
  {
    cube ab=new cube();
    ab.setvalue(5);
     int result=ab.getcube();
  System.out.printf("cube is%d",ab.getcube());

  }
}