package cie;
import java.util.*;
public class student
{	
	Scanner sc=new Scanner(System.in);
	public String usn,name;
	public int sem;
	public void getdata()
	{
		System.out.println("Enter usn , name and sem");
		usn=sc.nextLine();
		name=sc.nextLine();
		sem=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("NAME: "+name);
		System.out.println("USN: "+usn);
		System.out.println("SEM: "+sem);
	}
}
package cie;
import java.util.*;

public class internal extends student
{
	Scanner sc=new Scanner(System.in);
	public int imarks[]=new int[5];
	public void getdata()
	{
		super.getdata();
		System.out.println("enter cie marks for 5 subjects");
		for(int i=0;i<5;i++)
		{
			imarks[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		
		System.out.print("CIE MARKS: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(imarks[i]+ " ");
		}
		System.out.println();
	}
}

	
package see;
import cie.internal;
import java.util.*;
public class external extends internal
{
	Scanner sc=new Scanner(System.in);
	public int emarks[]=new int[5];
	public void getdata()
	{	super.getdata();
		System.out.println("enter 5 subject marks for see");
		for(int i=0;i<5;i++)
		{
			emarks[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		System.out.print("SEE MARKS: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(emarks[i]+" ");
		}
		System.out.println();
	}
}


import cie.student;
import cie.internal;
import see.external;
import java.util.*;
class exam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		int sum[]=new int[5];
		
		external e[]=new external[n];
		for(int i=0;i<n;i++)
		{
		
		e[i]=new external();
		e[i].getdata();
		System.out.print("FINAL MARKS of student"+(i+1)+": ");
		for(int j=0;j<5;j++)
		{
			sum[i]=e[i].emarks[j]+e[i].imarks[j];
			System.out.print(sum[i]+" ");
		}
		System.out.println();
		}
	}
}
