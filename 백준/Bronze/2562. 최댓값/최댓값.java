import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = 9;
		int max = 0;
		int input = 0;
		int loc = 0;
		
		for(int i=0; i<N; i++) {
			input = sc.nextInt();
			if(input > max) {
				max = input;
				loc = i+1;
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(loc);		
	}
}
