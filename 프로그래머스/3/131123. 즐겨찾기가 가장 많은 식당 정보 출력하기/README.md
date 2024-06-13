# [level 3] 즐겨찾기가 가장 많은 식당 정보 출력하기 - 131123 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131123) 

### 문제 풀이
- 틀린 이유
  - GROUP BY절에 사용된 컬럼 외의 SELECT절에서 언급된 컬럼들이 집계함수로 감싸져 있지 않음
  - HAVING MAX(FAVORITES)절은 SQL문법에 맞지 않음<br>
    => HAVING절은 집계함수의 결과를 필터링하는데 사용되기 때문에, 조건 명확히 지정해야함.<br>
       ex) MAX(FAVORITES) >= 50
    
        SELECT FOOD_TYPE
               ,REST_ID
               ,REST_NAME
               ,FAVORITES
            FROM REST_INFO
            GROUP BY FOOD_TYPE
            HAVING MAX(FAVORITES)
            ORDER BY 1 DESC; 

- 정답 풀이
   - 다중행 열 서브쿼리: 여러개의 열로 구성된 여러 개의 행인 테이블을 리턴.

                SELECT FOOD_TYPE
                       ,REST_ID
                       ,REST_NAME
                       ,FAVORITES
                    FROM REST_INFO
                    WHERE (FOOD_TYPE, FAVORITES) IN (
                          SELECT FOOD_TYPE, MAX(FAVORITES)
                            FROM REST_INFO
                            GROUP BY FOOD_TYPE
                    )
                    ORDER BY 1 DESC;
     
> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
