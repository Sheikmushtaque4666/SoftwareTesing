package OopsConcepts;

interface ABC{
	int a=10;
	int b=20;
	void m1();
}
interface XYZ{
	int a=30;
	int b=40;
	void m2();
}

public class Asignment implements ABC,XYZ {
	public void m1() {
		System.out.println(a+b);
	}
	public void m2() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Asignment a=new Asignment();
		a.m1();
		a.m2();
		}

}
