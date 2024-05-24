# [Bronze II] 상수 - 2908 

[문제 링크](https://www.acmicpc.net/problem/2908) 

### 성능 요약

메모리: 14168 KB, 시간: 124 ms

### 분류

구현, 수학

### 제출 일자

2024년 5월 24일 10:27:04

### 문제 설명

<p>상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.</p>

<p>상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.</p>

<p>두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.</p>

### 출력 

 <p>첫째 줄에 상수의 대답을 출력한다.</p>

 ----------------- ---------------------
 ### 풀이 방법 3가지
 1. StringBuilder - split 사용해서 배열에 넣는 방식
  - 코드 참고
    
 2. StringBuilder - StringTokenizer 사용해서 배열에 넣는 방식
  
  public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //공백기준으로 바로 다음 문자 읽어들음
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		System.out.println(a>b?a:b);

	}
}


 3. StringBuilder사용x - 정수 거꾸로 변환하는 식 사용
    
 public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int[] arr = new int[2];
		
		for(int i=0; i<2; i++) {
			int a = sc.nextInt(); //734
			while(a != 0) {
				int num = a%10;
				rev = rev * 10 + num;
				a /= 10;
			}
			arr[i] = rev;
			rev = 0;
		}
		System.out.println(Math.max(arr[0],arr[1]));
	}
}
