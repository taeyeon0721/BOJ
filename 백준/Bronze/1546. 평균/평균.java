import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double sum = 0.0; //실수로 선언★
		int max = -1; //입력받을 값이 0보다 크거나 같기 때문
		
		for(int i=0; i<N; i++) {
			int grade = Integer.parseInt(st.nextToken());
			
			if(grade > max) { //최대값 찾기 
				max = grade;
			}
			
			sum += grade; //누적산해서 점수의 총합 구해줌
		}
		
		System.out.println((sum/max)*100/N);//sum이 실수이기 때문에 다른 int값 자동 형변환
		
	}
}
