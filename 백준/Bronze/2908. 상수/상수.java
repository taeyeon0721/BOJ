import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //공백기준으로 바로 다음 문자 읽어들음
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		System.out.println(a>b?a:b);

	}
}