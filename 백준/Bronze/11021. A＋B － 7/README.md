# [Bronze V] A+B - 7 - 11021 

[문제 링크](https://www.acmicpc.net/problem/11021) 

### 성능 요약

메모리: 16056 KB, 시간: 160 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2024년 5월 21일 09:26:13

### 문제 설명

<p>두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 테스트 케이스의 개수 T가 주어진다.</p>

<p>각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)</p>

### 출력 

 <p>각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.</p>

 --------------------- -----------------------
 ### 풀이 방법
 - Scanner와 BufferedReader 두가지 방식으로 문제 해결
 - Scanner방식 추가


import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A,B=0;
		int i=0;
		int arr[] = new int[T];
		
		for(i=0; i<T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			arr[i] = A+B;
		}
		for(i=0; i<arr.length; i++) {
		System.out.println("Case #"+(i+1)+": "+ arr[i]);
		}
		
	}
}
   

