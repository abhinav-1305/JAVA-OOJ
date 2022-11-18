import java.util.Scanner;
public class Main{
   public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         double p;
         double q;
         double d;
         double r;
         double r1;
         double r2;
         System.out.println("enter the coefficient of x2 whch is a: ");
         int a=sc.nextInt();
         System.out.println("enter the coefficient of x which is b: ");
         int b=sc.nextInt();
         System.out.println("enter the constant c: ");
         int c=sc.nextInt();
         if(a==0){
         System.out.println("you cannot enter 0 as a value of a ");
         }
         d=(b*b)-4*a*c;
         if(a!=0)
         {
             if(d==0){
                r=-b/(2*a);
                System.out.println("therefore the roots are "+r+" and"+r);      
         }
             else if(d>0){
                r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
                r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
                System.out.println("therefore the roots are "+r1+" and "+r2);      
         }
             else{
                p=(-b)/(2*a);
                q=Math.sqrt(Math.abs(d))/(2*a);
                System.out.println("the first root is"+p+"+i"+q);
                System.out.println("the second root is"+p+"-i"+q);
         }
     }
   }
}






