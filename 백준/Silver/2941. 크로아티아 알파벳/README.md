# [Silver V] 크로아티아 알파벳 - 2941 

[문제 링크](https://www.acmicpc.net/problem/2941) 

### 성능 요약

메모리: 14280 KB, 시간: 128 ms

### 제출 일자

2024년 6월 3일 18:29:43

### 풀이 핵심
- contains, replace 함수 사용
  - input = input.replace(cro[i], "@");
    - input이라는 문자열에서 A라는 문자를 B로 대체.
    - cro[i]가 A위치에 들어간 이유는 input이라는 입력값에<br>
      크로아티아 문자가 포함 되어있기 때문.
    - 크로아티아 알파벳은 하나의 문자로 처리해야하기 때문에,<br>
      해당 문자를 '@' 혹은 '!'등의 하나의 문자로 치환 후
    - input.length로 길이 구함.

- for문을 몇번 반복할지 주의: cro.length



