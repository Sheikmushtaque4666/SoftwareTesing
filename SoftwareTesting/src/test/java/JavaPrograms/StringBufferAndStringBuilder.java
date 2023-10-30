package JavaPrograms;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
        //StringBuffer
		StringBuffer sb=new StringBuffer("Welcome");
		StringBuffer sbr=new StringBuffer(" to java");

		System.out.println(sb);
		System.out.println(sbr);
		System.out.println(sb.length());

		System.out.println(sb.reverse());

       //StringBuilder
		StringBuilder sbd=new StringBuilder("Shivay");
		System.out.println(sbd);
		System.out.println(sbd.length());
		System.out.println(sbd.charAt(2));//i
		System.out.println(sbd.substring(0,3));//Shi
		System.out.println(sbd.delete(3,5));//Shiy
		System.out.println(sbd.replace(0,3,"Shivay"));
		System.out.println(sbd.lastIndexOf("y"));
		
		System.out.println(sbd.reverse());
	}

}
