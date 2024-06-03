import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1157
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//toUpperCase:대문자 출력 조건이기 때문에, 입력값도 모두 대문자로 변환
		String s = br.readLine().toUpperCase();
		
		//알파벳 'A~Z'개수: 26
		int[] count = new int[26];
		//배열의 원소가 알파벳 순서대로 증가하도록
		for(int i=0; i<s.length(); i++) {
			//배열의 인덱스 도출
			int num = s.charAt(i) - 'A'; 
			count[num]++;
		}
		
		int max=-1;
		char ans='?';
		for(int i=0; i<count.length; i++) {
			if(count[i]>max) {
				max = count[i];
				//'A'의 ASCII 값(65)을 더하여 인덱스를 해당 알파벳 문자로 변환
				ans = (char)(i+'A');
			}else if(count[i]==max) {				
				ans = '?';
			}
		}
		System.out.println(ans);
	}
}
