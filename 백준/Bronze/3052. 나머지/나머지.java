import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int B = 42;
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			int A = sc.nextInt();
			arr[i] = A%B;
		}
		sc.close();
		
		arr = Arrays.stream(arr).distinct().toArray();
		System.out.println(arr.length);
	}
}