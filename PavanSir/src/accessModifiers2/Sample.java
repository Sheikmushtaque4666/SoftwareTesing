package accessModifiers2;
import accessModifiers3.ABC;

//--->Protected
/*public class Sample extends ABC {

	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.data=786;
		s.m1();

	}

}*/

//--->Public
public class Sample {

	public static void main(String[] args) {
		
		ABC s=new ABC();
		s.data=999;
		s.m1();

	}

}