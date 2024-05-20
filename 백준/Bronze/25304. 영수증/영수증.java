import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); //영수증에 적힌 총 금액
		int N = sc.nextInt(); // 구매한 물건의 종류의 수 -> for문 횟수
		int k = 0;	// 종류별 합계
		int sum = 0; 
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt(); // 물건의 가격
			int b = sc.nextInt(); // 물건 개수
			
			k = a*b; 
			sum = sum + k;
			// 변수k 사용안할시
			// sum += a*b 
		}
		sc.close();
		
		String result = (sum == X) ? "Yes": "No";
		System.out.println(result);
		
		
		
	}
}