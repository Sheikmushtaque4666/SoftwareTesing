package day3;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Welcome";
		String s1=" To Java";
		
		//length of a string
		System.out.println(s.length()); 
		
		//Joining of Strings
		System.out.println(s.concat(s1)); 
		
		//Trimming the string
		s="  Welcome  ";
		System.out.println("Before trimming string is:" +s);
		System.out.println("After trimming string is:" +s.trim());
		
		//chatAt()
		s="welcome";
		System.out.println(s.charAt(4)); //returns character based on index number, index will start from 0
		
		//contains()--->returns true
		s="Welcome";
		
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		//comparing string equals()
		s="Welcome";
		System.out.println(s.equals("Welcome"));    //true
		System.out.println(s.equals("Wel  come")); //false
		System.out.println(s.equals("welcome"));  //false
		
		System.out.println(s.equalsIgnoreCase("welcome"));  //true
		
		//replacing characters
		s="welcome to java";
		
		System.out.println(s.replace('o', 'i')); //welcime ti java
		System.out.println(s.replace("java","selenium")); //welcome to selenium
		
		//extracting substring from the main string
		s="Welcome";
		
		System.out.println(s.substring(0,4)); //Welc
		System.out.println(s.substring(1,5)); //elco
		
		//converting case
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		s="welcome";
		System.out.println(s.toUpperCase());








		
		
		


	}

}
