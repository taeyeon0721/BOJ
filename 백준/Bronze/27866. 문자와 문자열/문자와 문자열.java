import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int i = sc.nextInt()-1;
		//charAt()은 0번째부터 시작하기 때문에 
		//입력받는 정수 i에 -1을 해줘야함
		
		System.out.println(S.charAt(i));
		//charAt(): String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
		//charAt(1): 괄호안은 index로 문자열 내 위치 나타냄
	}
}