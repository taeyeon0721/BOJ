import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c = 0;
		int sum;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		if(a==b && a==c) {//셋다 같은 수
			sum = 10000+a*1000;
		}else if(a==b && a!=c || a==c && a!=b) {//셋중 둘: (a,b),c / (a,c),b
			sum = 1000+a*100;
		}else if(b==c && b!=a){//셋중 둘: (b,c),a
			sum = 1000+b*100;
		}else {//셋다 다른 수 일때
			//가장 큰수 구하기 
			max = a>b?a:b;
			if(c>max) {
				max = c;
			}
			sum = max*100;
		}
		System.out.println(sum);
	}
}
