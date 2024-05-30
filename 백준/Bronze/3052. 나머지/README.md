# [Bronze II] 나머지 - 3052 

[문제 링크](https://www.acmicpc.net/problem/3052) 

### 풀이 방법
<code>1. 스트림 사용: Arrays.stream(arr).distinct().toArray(); </code><br>
  -> (자바 배열 중복 제거 치니까 나와서 사용함..ㅎ)<br>
  -> ☆여기서 중요!! 배열은 선언시 길이가 고정되어 변하지 않지만, stream을 사용하면 가능(코드 참고)<br>
  -> 스트림에 대해 알아야 할 것 같아서 블로그 참고함! (https://tinyurl.com/2cfj4qby)

### 다른 풀이 
<code>2. HashSet 사용</code><br>
   -> 정의: 자바 Collection 중 Set 의 파생클래스<br>
   -> 특징1: 중복되는 원소를 넣을 경우 하나만 저장. 즉, 중복원소를 허용x<br>
   -> 특징2: HashSet 은 순서 개념이 없음. 따라서 Collections.sort() 메소드를 사용할 수 없음. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야함.<br>
   -> 참고: https://st-lab.tistory.com/46<br>

         Scanner in = new Scanner(System.in);
      		HashSet<Integer> h = new HashSet<Integer>();
       
      		for (int i = 0; i < 10; i++) {
      			h.add(in.nextInt() % 42);
      		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
      		}
              
      		in.close();
      		System.out.print(h.size());
      	}
