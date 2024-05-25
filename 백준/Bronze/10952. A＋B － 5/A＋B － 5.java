import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {//sc.hasNext()도 맞음
			int A = sc.nextInt();
			int B = sc.nextInt();
           		if(A == 0 && B == 0) break; //A,B둘다 0이어야하기 때문에 조건 따로 해주기 
						    -> 처음엔 이렇게 했는데, A+B==0 로 하면 음수 양수로 입력될수도 있으니까 
			System.out.println(A+B);
		}
		sc.close();
		
	}
}
