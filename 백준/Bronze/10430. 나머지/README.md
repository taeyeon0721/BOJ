# [Bronze V] 나머지 - 10430 

[문제 링크](https://www.acmicpc.net/problem/10430) 

### 성능 요약

메모리: 14152 KB, 시간: 104 ms

### 제출 일자

2024년 6월 2일 09:06:09

---------------  ------------------
### 풀이 핵심

- 연산자 우선순위★
  - System.out.println(((A%C)+(B%C))%C);  - 정답
  - System.out.println((A%C+B%C)%C);      - 정답
  - System.out.println((A%C)+(B%C)%C);    - 오류

  => 처음에 세번째 답을 제출해서 오류가 났는데, 이유는 연산자 우선순위에 있다.
  - 1,2번 식은 괄호에 따라 A%C와 B%C의 결과를 더한 후 C로 나누는 것이고,
  - 3번은 A%C와 (B%C)%C를 한 결과를 더한것이다.
    
  => 그래서 답에 차이가 났던 것임. 연산자 우선순위 주의!!!!

