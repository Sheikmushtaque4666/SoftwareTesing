package OopsConcepts;

public class OverloadMainMethod {
	public void main(int x) {
		System.out.println(x);
	}
	public void main(int x,int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		OverloadMainMethod om=new OverloadMainMethod();
		om.main(100);
		om.main(100,200);
			
	}

}
