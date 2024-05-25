# [Bronze V] A+B - 4 - 10951 

[문제 링크](https://www.acmicpc.net/problem/10951) 

### 핵심 이론
- EOF란?
  
   End of File의 약자로, 입력에서 더이상 읽을 수 있는 데이터가 없음을 나타내는 용어이다.<br>
   읽을 수 있는 데이터가 없다는 뜻은 입력을 하지 않았다는 뜻과 같으므로 null을 의미한다.

- 처리하는 방법?
  
   while(true)로 했을 때, 반복문은 계속해서 돌며 입력값을 요구하지만 값이 들어오지 않는다면 에러를 발생시킨다.<br>
   그래서<br>
   Scanner -> while(sc.hasNext()){} <br>
   BufferedReader -> while((str=readLine())!=null) 을 사용해주면<br>
   EOF일 경우 false반환, 값이 있는 경우엔 true 반환으로 잘 처리가 된다.


### 풀이 방법 3가지
1. Scanner 사용
   
          	public static void main(String[] args) {
          		
          		Scanner sc = new Scanner(System.in);
          		
          		while(sc.hasNextInt()) {
          			int A = sc.nextInt();
          			int B = sc.nextInt();
          			System.out.println(A+B);
          		}
          		sc.close();
          	}

         -> 난 사실 이 코드가 가장 간단하고 편했다 ㅠㅠ

3. BufferedReader - StringBuilder - StringTokenizer 사용

       위 코드 참고
   
4. BufferedReader - StringBuilder - charAt 사용
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringBuilder sb = new StringBuilder();
     		String str;
      
     		while( (str=br.readLine()) != null ){
     		    
     			int a = str.charAt(0) - 48;
     			int b = str.charAt(2) - 48;
     			sb.append(a+b).append("\n");
     		
     		}
     		System.out.print(sb);

       -> charAt()dms 해당 문자의 아스키코드값을 반환하기 때문에 정수형태로 변환하기 위해서는
          반드시 -48 또는 -'0'을 해주어야 한다.

