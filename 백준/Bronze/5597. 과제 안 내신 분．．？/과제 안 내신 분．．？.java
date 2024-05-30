import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		boolean arr[] = new boolean[31];
		//arr[30]으로 하면 왜자꾸 index 범위 오류가 나지 했는데 
		//arr[30]의 유효한 인덱스는 0부터 29까지이기 때문에 아래서 1부터 30까지 돌리면 오류
		//★크기를 31로 설정하여 1부터 30까지 사용할 수 있도록 함

		for(int i=1; i<=28; i++) {
			int sub = sc.nextInt(); //제출자의 출석번호: sub
			arr[sub] = true;		//★제출자의 출석번호를 인덱스로 
		}
		sc.close();
		
		for(int j=1; j<=30; j++) {
			if(!arr[j]) {
				System.out.println(j);
			}
		}
	}
}
