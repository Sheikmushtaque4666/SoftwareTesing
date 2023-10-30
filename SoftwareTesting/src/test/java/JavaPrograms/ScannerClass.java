package JavaPrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Enter your Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		System.out.println("Enter your Age");
		int age=sc.nextInt();	
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);

		
	}

}
