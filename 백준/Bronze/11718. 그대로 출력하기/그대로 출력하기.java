import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a ="";
		
		while(((a=br.readLine()) != null)&&(a.length()>0)){
			System.out.println(a);
		};
		
	}
}