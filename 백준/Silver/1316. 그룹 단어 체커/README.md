# [Silver V] 그룹 단어 체커 - 1316 

[문제 링크](https://www.acmicpc.net/problem/1316) 

### 성능 요약

메모리: 14392 KB, 시간: 108 ms

### 제출 일자

2024년 6월 4일 20:07:26

### 풀이 과정
- 생각보다 어려웠던 문제.. 아직 코드짜는데 많이 미숙하다고 느낌<br>
  주석으로 풀이 복기하기
  - if(seen[curr - 'a'])       -> if(true)와 같으므로, 현재문자가 이전에 등장했는지 "확인"하는 용도
  - seen[curr - 'a'] = true;   -> 현재 문자가 처음 등장했음을 배열에 "기록"
    - 위 코드 두 줄의 차이를 명확히 구별하기!!
  - return true/false;
    - return 문이 실행되면 메서드는 호출한 곳으로 값을 반환한 후,
    - 즉시 종료됨.
    - 그 이후의 어떤 코드도 실행되지 않음
  
            public class Main {
            
            public static void main(String[] args) throws IOException {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int cnt=0;
            
            for(int i=0; i<N; i++) {
            String word = br.readLine(); //단어 입력받기
            if(isGroupWord(word)) {      //입력받은 단어가 그룹단어라면?
             cnt++;                      //개수세기(입력값중에 몇개가 그룹단어인지)
            }
            }
            System.out.println(cnt);
            }
            
            public static boolean isGroupWord(String word) { //리턴타입이 boolean인 isGroupWord 메서드
            boolean[] seen = new boolean[26];       //이미 나왔던 단어있지 체크하기 위해 알파벳 개수대로 배열생성
            char prev ='\u0000';                    //현재문자와 비교할 이전문자 -> char타입의 기본값이 널문자로 초기화
            
            for(int i=0; i<word.length(); i++) { 
            char curr = word.charAt(i);  //입력받은 문자열의 문자열에서 문자 하나 가져옴
             
            if(prev != curr) {         //현재 문자가 이전 문자와 다를때==연속된 문자가 아닐때
             if(seen[curr - 'a']) {    //이미 등장한적이 있다면 
              return false;            //그룹단어가 아니므로 false반환하고 메서드 종료
             }
             seen[curr - 'a'] = true;  //현재 문자가 처음등장했으므로 배열에 true저장
             prev = curr;              //이전문자를 현재문자로 업데이트 -> 다음 문자(word.charAt(i)을 비교하기 위해
            }
            }
            
            return true; //그룹단어가 아니라면 false를 반환하고 끝났겠지만
                          그룹단어이기 때문에 루프를 다 돌고 true반환!
            }
            }
