import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		for(int i=0; i<N;i++) {
			String ans = sc.next();
			arr[i] = ans.charAt(0)+""+ans.charAt(ans.length()-1);
		}
		sc.close();
		
		for(String k: arr) {
			System.out.println(k);
		}
		
	}
}