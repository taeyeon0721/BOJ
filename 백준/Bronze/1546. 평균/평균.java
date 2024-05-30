import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float total = 0;
		float max = 0;
		int[] arr = new int[N];
		
		
		for(int i=0; i<N; i++) {
			int grade = sc.nextInt();
			arr[i] = grade;
			if(grade > max) {
				max = grade ;
			}			
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			total = total + (arr[i]/max)*100;
		}
		float avg = total/N;
		System.out.println(avg);
	}
}
