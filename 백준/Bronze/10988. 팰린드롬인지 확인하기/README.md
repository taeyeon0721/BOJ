# [Bronze III] 팰린드롬인지 확인하기 - 10988 

[문제 링크](https://www.acmicpc.net/problem/10988) 

### 성능 요약

메모리: 14332 KB, 시간: 108 ms

### 제출 일자

2024년 6월 3일 11:38:01

---------------------- ------------------------
### 풀이 과정
- 핵심
  - 초기값 설정: result를 처음에 1로 설정 (문자열이 대칭이라고 가정)
  - 비대칭 발견 시 조기 종료: 대칭이 아닌 부분을 발견하면 result를 0으로 설정하고 루프 종료
  - 반복문 길이: 문자열의 절반만 검사하여 불필요한 비교를 줄임<br>
    **문자열이 홀수일때, 마지막 남은 가운데 문자는 어차피<br>
      자기 자신과 비교하기 때문에 동일할 수 밖에 없음 => 고로, length/2
  - if문 조건 잘 생각해서 쓰기: 맨끝부터 대칭되는 값 올바르게 구하도록 


- 내 처음 풀이에서 수정할 점

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String[] arr= br.readLine().split("");
    		int result=0; //초기값 설정 문제 
    		
    		for(int i=0; i<arr.length; i++) { 
    			if(arr[i].equals(arr[arr.length-1-i])) { //결과 덮어쓰기 문제, 대칭아닌경우 빠른 종료 불가
    				result = 1; 
    			}else{
    				result = 0; 
    			};
    		}
    		System.out.println(result);


  - 결과 덮어쓰기 문제
    - for 루프 안에서 result 변수를 반복적으로 0 또는 1로 설정하고 있는데,<br>
    이 경우 한 번이라도 대칭이 아닌 부분이 발견되면 result가 0으로 설정되며, 이후 다시 1로 변경될 수 있음.<br>
    이는 최종 결과가 올바르게 나오지 않게함.
  - 중간에 대칭이 아닌 경우를 빠르게 종료하지 않음
    - 대칭이 아닌 경우를 발견하면 더 이상 검사할 필요 없이 바로 0을 출력해야함.
 
