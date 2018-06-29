package Trail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args)  {

		//int a = (Integer) null;
		
		
		try {
			FileReader fr  = new FileReader("file.txt");
			BufferedReader br = new BufferedReader(fr);
			String g;
			while( (g = br.readLine() )!= null ) {
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		

	}
}