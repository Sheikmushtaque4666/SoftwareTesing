package JavaPrograms;

public class Array_SingleDimension {

	public static void main(String[] args) {
		// 1.Declare an array with Size
		int a[]=new int[5]; //starting index is 0,Lst index is 4
		
		//2.Insert values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a[3]);//400
		
		//Approach 2--->Declare an array without Size
		int arr[]= {100,200,300,400,500,600};
		
		//3.Find size of an array
		System.out.println(a.length);
		System.out.println(arr.length);
		
		//4.Read values fron an array----using for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//Using for each/enhanced loop
		for(int i:a){
			System.out.println(i);
		}
		for(int i:arr) {
			System.out.println(i);
		}
		String str[]={"abc","mno","pqr","str"};
		
		for(String i:str) {
			System.out.println(i);
		}
	}

}
