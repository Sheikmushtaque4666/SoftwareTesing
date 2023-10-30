package JavaPrograms;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome";
		String st=" To ";
		String str=" Java";
		
		System.out.println(s);
		
		//length()
		System.out.println(s.length());//7
		
		//concat()
		System.out.println(s.concat(st).concat(str));//Welcome to java
		
		//trim
		s="  WELCOME  ";
		System.out.println("Before triming string is:"+s);
		System.out.println("After triming string is:"+s.trim());
		
		//CharAt()    0  1 2 3 4 5 6
		s="Welcome";//W  e l c o m e
		System.out.println(s.charAt(3));
		
		//contains()
		s="Shivay";
		System.out.println(s.contains("Shiv"));//true
		System.out.println(s.contains("yav"));//False
		System.out.println(s.contains("vay"));//True
		
		//equals
		s="Shivay";
		System.out.println(s.equals("Shivay"));
		System.out.println(s.equals("shivay"));
		
		//equalIgnoreCase
		s="Johan";
		System.out.println(s.equalsIgnoreCase("Johan"));//true
		System.out.println(s.equalsIgnoreCase("JOHAN"));//true
		System.out.println(s.equalsIgnoreCase("jOHAN"));//true
		
		//toUpperCase
		s="Welcome";
		System.out.println(s.toUpperCase());
		
		//toLowerCase
		s="Welcome";
		System.out.println(s.toLowerCase());
		
		//substring
		s="ShivayNamah";
		System.out.println(s.substring(0,5));//Shiva
		System.out.println(s.substring(1,7));//hivayN
		System.out.println(s.substring(0,11));//ShivayNamah

	}

}
