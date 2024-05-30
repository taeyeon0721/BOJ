import java.util.Scanner;

//10811
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			int L = sc.nextInt() -1; //★배열 0부터 시작
			int R = sc.nextInt() -1;
			while(L<R) {
				int tmp = arr[L];
				arr[L++] = arr[R];
				arr[R--] = tmp;				
			}	
		}
		/* 두번째 for문: -1 이유 추가 설명
		   -> 바구니는 1번부터 n번까지의 번호를 가지고 있지만
		   	  실제로 인덱스는 0부터 시작함
		   	  ex) 1,2,3,4에서 3번째는 3이지만
		      ex) 0,1,2,3에서 3번째는 4이다.
		   => 따라서 L,R의 입력값에는 각각 -1을 해줘야 한다.
		*/
		
		sc.close();
		for(int result: arr) {
			System.out.print(result+" ");
		}
		
	}
}
