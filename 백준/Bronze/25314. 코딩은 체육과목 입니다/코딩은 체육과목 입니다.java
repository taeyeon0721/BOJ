import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = N/4;
		sc.close();
		
		for(int i=1; i<=c; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}