import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //br.readLine() -> 입력
        int T = Integer.parseInt(br.readLine()); 

        for(int i=0; i<T; i++){
        	//st.nextToken() -> 공백단위로 데이터 가공
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write((A + B) + "\n");
        }
        br.close();

        bw.flush();     // 남아있는 데이터 모두 출력
        bw.close();
	}
}