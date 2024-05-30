import java.util.Scanner;

//2525
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ex = sc.nextInt();
		sc.close();
		
		//다 분으로 만든 다음 시간으로 바꾸기
		m = h*60 + m + ex;
		
		h = m/60;
		m = m%60;
		if(h>=24) h = h%24;
		System.out.println(h+" "+m);
	
	}
}
