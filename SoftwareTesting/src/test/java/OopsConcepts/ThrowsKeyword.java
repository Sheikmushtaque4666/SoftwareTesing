package OopsConcepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr=null;
		fr=new FileReader("C:\\Users\\sheik\\OneDrive\\Pictures\\Screenshots\\OneDrive\\Documents\\tESTdEMO.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(3000);
	}

}
