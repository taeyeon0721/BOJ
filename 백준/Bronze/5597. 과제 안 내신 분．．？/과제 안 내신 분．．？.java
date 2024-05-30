import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//5597 BufferedReader 사용
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[] arr = new boolean[31];
		
		for(int i=1; i<=28; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int sub = Integer.parseInt(st.nextToken());
			arr[sub] = true;
		}
		for(int i=1; i<arr.length; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		
	}
}
