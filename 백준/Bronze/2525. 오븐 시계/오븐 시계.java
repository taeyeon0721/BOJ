import java.util.Scanner;

//2525
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ex = sc.nextInt();
		sc.close();
		
		if((m+ex)>=60) {
			int A = h+(m+ex)/60;
			int B = (m+ex)%60;
			if(A>=24) A=A%24;
			System.out.println(A+" "+B);
		}else{
			System.out.println(h+" "+(m+ex));
		}
	
	}
}