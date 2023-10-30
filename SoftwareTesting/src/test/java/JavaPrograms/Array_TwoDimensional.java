package JavaPrograms;

public class Array_TwoDimensional {

	public static void main(String[] args) {
		// 1.Declare an array with Size
		
		int a[][]=new int[3][2];
		
		//2.Insert values into array
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		//3.Find size of an array
		System.out.println("Number of rows:"+a.length);
		System.out.println("Number of columns:"+a[0].length);
		
		int arr[][]={{100,200}, {300,400}, {500,600}, {700,800}};
		
		System.out.println("Number of rows:"+arr.length);
		System.out.println("Number of columns:"+arr[0].length);
		
		//4.Read values fron an array----using for loop
		
		/*for(int i=0;i<=a.length;i++) {//Outer Loop
			
			for(int j=0;j<a[i].length;j++) {//Inner Loop
				
				System.out.println(a[i][j]);
			}
		}*/
		/*for(int i=0;i<=arr.length;i++) {//Outer Loop
		
		   for(int j=0;j<arr[i].length;j++) {//Inner Loop
			
			System.out.println(arr[i][j]);
		}
	}*/
		//Using for each/enhanced loop
		for(int r[]:a) {
			for(int i:r) {
				System.out.println(i);
			}
		}
	
		
		



	}

}
