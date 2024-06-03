import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	      
	   String total = "1,1,2,2,2,8";
	   String[] arr = total.split(",");
	 
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine()," ");	   
	   
	   for(int i=0; i<arr.length;i++) {
		  int input = Integer.parseInt(st.nextToken());
		  int A = Integer.parseInt(arr[i]);
		  
		 int ans = A-input;
		 arr[i] = Integer.toString(ans);
	   }
		
		for(String k: arr) { 
			System.out.print(k+" ");
		}
		 
	   
	   
	}
}
