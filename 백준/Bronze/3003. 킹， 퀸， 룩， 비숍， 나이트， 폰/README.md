# [Bronze V] 킹, 퀸, 룩, 비숍, 나이트, 폰 - 3003 

[문제 링크](https://www.acmicpc.net/problem/3003) 

### 성능 요약

메모리: 14304 KB, 시간: 112 ms

### 제출 일자

2024년 6월 3일 10:31:32

---------------------- --------------------------
### 풀이 핵심
- 내 풀이: 배열 사용
  - 기본으로 주어진값을 콤마(,)로 연결된 하나의 문자열로 만듦
  - 콤마(,)를 기준으로 문자를 분리하여 배열에 넣기
  - 입력값을 받을 때 마다 배열에 있는 값을 차례로 가져와서 마이너스 연산해주고
  - 그 값을 다시 배열의 값으로 초기화 시켜줌

 - 참고한 풀이
   - 체스 말 마다 각각 변수를 선언 및 초기화 함
   - 입력값 받을 때마다 체스말 -= 입력값 해서 바로 출력해주기
  
  => 내가 좀 복잡하게 생각했던 것 같기도 하고.. ㅎ
