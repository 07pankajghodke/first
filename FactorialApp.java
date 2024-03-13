class Factorial 
{ int no;
  void setvalue(int x)
   {
     no=x;
  }
  int getFactorial()
  {      int fac=1;
         for(int i=1;i<=no;i++)
	 {
	  fac=fac*i;
			
	}
        return fac;
  }

}
public class FactorialApp {

public static void main(String x[]) 
{
	Factorial f1=new Factorial();
         f1.setvalue(5);
         int fa=f1.getFactorial();
                
	System.out.printf(" factorial is %d\n",fa);

	}

}