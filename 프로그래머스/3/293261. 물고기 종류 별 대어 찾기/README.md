# [level 3] 물고기 종류 별 대어 찾기 - 293261 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/293261) 

### 풀이 과정
1. 1차 코드
   - 틀린 이유
     - SELECT 절에 GROUP BY에 없는 컬럼이 있으면 안됨.
     - SELECT 절에 있는 모든 컬럼은 'GROUP BY'절에 있어야 하거나★<br>
               집계함수(예: MAX, SUM, COUNT 등)로 감싸져 있어야 함.★
     
                   SELECT A.ID, B.FISH_NAME, MAX(A.LENGTH)
                        FROM FISH_INFO A
                        INNER JOIN FISH_NAME_INFO B
                        ON A.FISH_TYPE = B.FISH_TYPE
                        GROUP BY A.FISH_TYPE
                        ORDER BY 1;

2. 2차 코드
   - 틀린 이유
     - 동일한 FISH_TYPE 물고기가 동일한 최대 길이를 가진 경우,<br>
       원하는 결과와 다르게 여러 행이 반환될 수 있음.
       
               SELECT A.ID, B.FISH_NAME, A.LENGTH
                        FROM FISH_INFO A
                        INNER JOIN FISH_NAME_INFO B ON A.FISH_TYPE = B.FISH_TYPE
                        WHERE A.LENGTH = (
                            SELECT MAX(LENGTH)
                            FROM FISH_INFO
                            WHERE FISH_TYPE = A.FISH_TYPE
                        )
                        ORDER BY 1;

3. 최종 정답
   - GROUP BY가 핵심
   - GROUP BY를 통해 각 FISH_TYPE당 하나의 결과행만 도출
     
             SELECT A.ID, B.FISH_NAME, A.LENGTH
                        FROM FISH_INFO A
                        INNER JOIN FISH_NAME_INFO B ON A.FISH_TYPE = B.FISH_TYPE
                        WHERE (A.FISH_TYPE, A.LENGTH) IN (
                                SELECT FISH_TYPE, MAX(LENGTH)
                                FROM FISH_INFO
                                GROUP BY FISH_TYPE ★
                            )
                        ORDER BY 1;



> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
