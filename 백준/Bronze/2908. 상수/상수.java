import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(sb.append(str[0]).reverse().toString());
		sb.setLength(0);
		int b = Integer.parseInt(sb.append(str[1]).reverse().toString());
		
		System.out.println(a>b?a:b);
		
	}
}