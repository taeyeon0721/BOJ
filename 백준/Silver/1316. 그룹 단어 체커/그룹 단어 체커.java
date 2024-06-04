import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1316
public class Main {

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		
		for(int i=0; i<N; i++) {
			String word = br.readLine();
			if(isGroupWord(word)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean isGroupWord(String word) {
		boolean[] seen = new boolean[26];
		char prev ='\0';
		
		 for(int i=0; i<word.length(); i++) { 
			char curr = word.charAt(i); 
		  
			if(curr != prev) { //현재 문자가 이전 문자와 다르다면 == 연속된 문자가 아니라면
				if(seen[curr - 'a']) {//이미 등장한적 있는지 확인 
					return false; //true면 그룹단어가 아니므로 false반환
				}
				seen[curr - 'a'] = true;//현재 문자가 처음등장했으므로 배열에 기록
				prev = curr;		//이전문자를 현재문자로 업데이트
			}
		 }
		 
		return true;
	}
}
