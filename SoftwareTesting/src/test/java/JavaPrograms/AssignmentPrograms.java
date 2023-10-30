package JavaPrograms;

import java.util.Scanner;

public class AssignmentPrograms {

	public static void main(String[] args) {
		
        /*1.Wap first print hello on screen and then u r name on separate line.
         String a="Mushtaque";
		System.out.println("Hello "+(a));*/
		
		/*2.Wap swapping two numbers.
		 
		    int a=10;
			int b=20;
			
			a=a+b;//a=30
			b=a-b;//b=30-20=>10
			a=a-b;//a=30-10=>20
			System.out.println("a--->"+a);
			System.out.println("b--->"+b);*/
		
		/*3.Wap to print  sum of two numbers
		
			System.out.println("Enter Two Numbers:");
			int i=20;
			int j=30;
			System.out.println(i+"+"+j);
			int sum=i+j;
			System.out.println("The sum of 2 numbers is="+sum);*/
		
		//4.find the largest of 2 numbers using ifelse ?
		//Approach1
		/*int a=10, b=20;
		if(a>b) //10>20
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(b);
		}*/
		
		//Approach2
		int a,b;
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
		  
		
		
		
	
	}
}
