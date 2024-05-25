import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {//sc.hasNext()도 맞음
			int A = sc.nextInt();
			int B = sc.nextInt();
            if(A + B == 0) break;
			System.out.println(A+B);
		}
		sc.close();
		
	}
}