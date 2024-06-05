import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [][] arr = new char[5][15];
		int max = 0;

		for(int r=0; r<arr.length; r++) {
			String str = br.readLine();
			if(str.length()>max) max = str.length();
			
			for(int c=0; c<str.length(); c++) {
				arr[r][c] = str.charAt(c);//입력받은 문자 그대로 배열에저장
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<max; i++) {//최대 단어 입력수 == 열
			for(int j=0; j<5; j++) { //총5줄
				if(arr[j][i] == '\0') {//빈문자열이면 출력하지 않기:null
					continue;
				}
				sb.append(arr[j][i]);
			}
		}
		System.out.println(sb);
	}
}
