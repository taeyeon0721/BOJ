import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T;i++) {
			int C = Integer.parseInt(br.readLine()); //거스름돈
			int q = C/25;
			int d = C%25/10;
			int n = C%25%10/5;
			int p = C%25%10%5;

		System.out.println(q+" "+d+" "+n+" "+p);
		}
	}
}
