import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2563
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //색종이 개수 
		int totalArea = 0; //검은 영역의 넓이
		boolean[][] arr = new boolean[100][100]; //도화지(boolean배열 초기값:false)
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			for(int j=x; j<x+10; j++) {
				for (int k = y; k<y+10; k++) {
                    if (!arr[j][k]) {//해당칸이 아직 덮이지 않았다면
                        arr[j][k] = true; //덮었다고 표시
                        totalArea++; //넓이 증가
                    }
                }
			}
		}
	System.out.println(totalArea);	
		
		
	}
}

