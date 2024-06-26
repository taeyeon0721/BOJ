# [Bronze IV] 숫자의 합 - 11720 

[문제 링크](https://www.acmicpc.net/problem/11720) 

### 성능 요약

메모리: 14296 KB, 시간: 120 ms

### 분류

구현, 수학, 문자열

### 제출 일자

2024년 5월 22일 11:47:37

### 문제 설명

<p>N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.</p>

### 출력 

 <p>입력으로 주어진 숫자 N개의 합을 출력한다.</p>

 -------------------------- ---------------------------
### 풀이 방법
1. Scanner - charAt을 사용
   - 문자열을 받아서 charAt을 통해 char타입의 한글자로 바꿔줌
   - 바꾼글자들을 누적합해서 결과 도출 ** 주의: 아스키코드 값으로 저장되는 것 방지 

2. BufferedReader - split(), 배열 사용o
   - String 배열을 선언한 다음, split("")을 이용하여 배열 한 칸에 한글자씩 저장
   - (입력하는 문자에 공백이 없다면 ex)54321, 각 숫자를 개별 문자열로 나누게 됨)
   - String 배열의 값을 int형으로 변환하여 누적합
  
3. BufferedReader - getBytes() 사용, 배열 사용x
   - getBytes: 문자열의 각 자릿값을 반환받을 수 있는 함수

public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // N은 쓸모가 없으므로 입력만 받는다.
		int sum = 0;
		
		/* getBytes: 문자열을 입력받을 때,
		   해당 '문자열의 각 자릿값을 반환'받을 수 있는 방법 */
		for(byte k : br.readLine().getBytes()) {
			sum += (k -'0');
		};
		System.out.println(sum);	
		
	}
     
