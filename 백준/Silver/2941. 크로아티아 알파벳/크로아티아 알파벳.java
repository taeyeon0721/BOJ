import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		String str = "c=,c-,dz=,d-,lj,nj,s=,z=";
		String[] cro = str.split(",");		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(int i=0; i<cro.length;i++) {
			if(input.contains(cro[i])) {
				//input문자열에 있는 크로아티아 알파벳을 문자하나로 치환해서 길이구함
				input = input.replace(cro[i], "@");
			}
		}
		System.out.println(input.length());
	}
}
