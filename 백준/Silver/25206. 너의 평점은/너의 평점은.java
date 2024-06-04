import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double total = 0;
		double scoreSum = 0;
		double sum = 0;
		
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			double avg = 0;
			boolean isValidGrade = true;
			
			switch(grade) {
			case "A+":
				avg = 4.5;
				break;
			case "A0":
				avg = 4.0;
				break;
			case "B+":
				avg = 3.5;
				break;
			case "B0":
				avg = 3.0;
				break;
			case "C+":
				avg = 2.5;
				break;
			case "C0":
				avg = 2.0;
				break;
			case "D+":
				avg = 1.5;
				break;
			case "D0":
				avg = 1.0;
				break;
			case "F":
				avg = 0.0;
				break;
			case "P":
				isValidGrade = false;
				break;
			default://grade에 예상치 못한 입력값이 들어왔을 때 처리 
				isValidGrade = false;
				break;
			}
			if(isValidGrade) {
				scoreSum += score; 
				sum += score*avg;
			}
		}
		total = sum/scoreSum;
		System.out.println(total);
		
		
		
	}
}
