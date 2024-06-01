import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		int B1 = Integer.parseInt(B.substring(0,1));
		int B2 = Integer.parseInt(B.substring(1,2));
		int B3 = Integer.parseInt(B.substring(2,3));
		
		System.out.println(A*B3);
		System.out.println(A*B2);
		System.out.println(A*B1);
		System.out.println(A*Integer.parseInt(B));
		
	}
}
