import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		/* String 배열을 선언한 다음, 
		   split("")을 이용하여 배열 한 칸에 한글자씩 저장되도록 */
		String[] str = br.readLine().split("");
		br.close();
		
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
	}
}
