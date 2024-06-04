# [Silver V] 너의 평점은 - 25206 

[문제 링크](https://www.acmicpc.net/problem/25206) 

### 성능 요약

메모리: 14412 KB, 시간: 132 ms

### 제출 일자

2024년 6월 4일 23:18:25

### 풀이 핵심


- 주의해야할 점
  - 등급이 P인 과목은 계산에서 제외해야 함.
  - 등급에 따른 과목평점 변환 -> switch-case문 사용
  - 평균이니까 실수형 사용 -> float/double<br>
    (대략적으로 10^6이하의 값에 대해서는 float사용 가능.<br> 그 이상은 double: 더 정밀한 값)
    
- 비슷한 다른 풀이
  

	    public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double sumNumxScore = 0;
		double sumNum = 0;
	
		for(int i = 0; i < 20; i++){
		    st = new StringTokenizer(br.readLine());
		    String object = st.nextToken();
		    double num = Double.parseDouble(st.nextToken());
		    String alphabet = st.nextToken();
		    double score = 0;
	
		    // P가 아닐 때만 체크
		    if(!(alphabet.equals("P"))){
			// 과목 평점 계산
			switch (alphabet) {
			    case "A+":
				score = 4.5;
				break;
			    case "A0":
				score = 4.0;
				break;
			    case "B+":
				score = 3.5;
				break;
			    case "B0":
				score = 3.0;
				break;
			    case "C+":
				score = 2.5;
				break;
			    case "C0":
				score = 2.0;
				break;
			    case "D+":
				score = 1.5;
				break;
			    case "D0":
				score = 1.0;
				break;
			    case "F":
				score = 0.0;
				break;
			    default:
				break;
			}
	
			sumNumxScore += (num*score);
			sumNum += num;
		    }
		}
		// 소수점 아래 6자리까지 출력
		System.out.printf("%.6f", sumNumxScore/sumNum);
		br.close();
	    }
  
