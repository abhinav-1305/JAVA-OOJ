import java.util.Scanner;
class QuadraticEq1
{
  public static void main(String XX[])
  {
   double a;
   double b;
   double c;
   double root1,root2;

   Scanner SS=new Scanner(System.in);
   System.out.print("Enter the values of a,b,c");
   a=SS.nextDouble();
   b=SS.nextDouble();
   c=SS.nextDouble();
   double determinant=b*b-4*a*c;
     {
       if(a==0)
       System.out.print("It is not a quadratic equation");
       else
         { 
           if(determinant>0)
             {
               root1=((-b+Math.sqrt(determinant))/2*a);
               root2=((-b-Math.sqrt(determinant))/2*a);
               System.out.print("The roots are distinct and real:"+root1+"and "+root2);
              }
           if(determinant==0)
             { 
               root1=root2=-b/2*a;
               System.out.print("The roots are equal:"+root1);
              }
           if(determinant<0)
             {
               root1=((-b+Math.abs(Math.sqrt(determinant)))/2*a);
               root2=((-b-Math.abs(Math.sqrt(determinant)))/2*a);
               System.out.print("the roots are imaginary:"+"i"+root1+" "+"i"+root2);
             }
         }
     }
  }
}




