import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			
			String[] S = br.readLine().split(" ");
			int R = Integer.parseInt(S[0]);
			
			for(byte k: S[1].getBytes()) {
				for(int j=0; j<R; j++) {
					sb.append((char)k);
					//주의: char타입으로 안바꿔주면 아스키코드로 출력됨
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
