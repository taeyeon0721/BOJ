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
		//arr[30]으로 하면 왜자꾸 index 범위 오류가 나지 했는데 
		//arr[30]의 유효한 인덱스는 0부터 29까지이기 때문에 아래서 1부터 30까지 돌리면 오류
		//★크기를 31로 설정하여 1부터 30까지 사용할 수 있도록 함
		
		for(int i=1; i<=28; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int sub = Integer.parseInt(st.nextToken()); //제출자의 출석번호: sub
			arr[sub] = true; 			//★제출자의 출석번호를 인덱스로 
		}
		for(int i=1; i<arr.length; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		
	}
}
