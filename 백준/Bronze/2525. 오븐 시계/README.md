# [Bronze III] 오븐 시계 - 2525 

[문제 링크](https://www.acmicpc.net/problem/2525) 

### 성능 요약

메모리: 18440 KB, 시간: 228 ms

### 제출 일자

2024년 5월 30일 18:07:34

---------------------------- ---------------------------------
### 풀이 핵심
- 시를 분으로 변환해서 분으로 계산한 다음 값을 구해주는게 편하다!!!!

- 제출 이외의 풀이
  : 이건 내가 처음 풀었던 풀이로, 시와 분을 각각 계산해준 것이다. <br>복잡하긴 해서 권장하진 않는다.

       Scanner sc = new Scanner(System.in);
       int h = sc.nextInt();
       int m = sc.nextInt();
       int ex = sc.nextInt();
       sc.close();
     
       if((m+ex)>=60) {
        int A = h+(m+ex)/60;
        int B = (m+ex)%60;
        if(A>=24) A=A%24; // 출력시간을 0~23사이로 나타내라고 했기 때문
        System.out.println(A+" "+B);
       }else{
        System.out.println(h+" "+(m+ex));
       }




