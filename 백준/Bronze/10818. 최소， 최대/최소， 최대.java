import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//초기값 설정이 핵심!!
		int min = 1000001;
		int max = -1000001;
		
		for(int i=0; i<N; i++) {
			int cur = sc.nextInt();
			//Math클래스의 max,min메서드
			//-> 전달된 데이터 중 더 큰 수와 작은 수 반환
			min = (Math.min(min, cur)); 
			max = (Math.max(max, cur));
		}
		sc.close();
		
		System.out.println(min+" "+max);
	}
}