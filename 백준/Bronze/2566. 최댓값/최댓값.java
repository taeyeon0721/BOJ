import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr = new int[9][9];
		int max = 0;
		int A = 0,B = 0;
		
		for(int r=0; r<9; r++) {
			st = new StringTokenizer(br.readLine()," "); //readLine() 위치 주의★
			for(int c=0; c<9; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
				if(arr[r][c] > max) {
					max = arr[r][c];
					A = r+1; 
                    B = c+1;
				}else if(max == 0){
                    A = 1;
                    B = 1;
                }
			}
		}
		System.out.println(max);		
		System.out.print(A+" "+B);		
	}
}
