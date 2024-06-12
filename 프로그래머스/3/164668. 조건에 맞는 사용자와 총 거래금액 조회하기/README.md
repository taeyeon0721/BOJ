# [level 3] 조건에 맞는 사용자와 총 거래금액 조회하기 - 164668 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164668) 

### 구분

코딩테스트 연습 > GROUP BY

### 제출 일자

2024년 06월 12일 19:17:48

### 풀이 과정
- 내가 처음 썼던 틀린 코드 이유
  - 70만원이라고 해서 쉼표 쓰면 안됨 -> 숫자 형식으로 인식 안하므로 700000으로 수정
  - WHERE와 HAVING의 차이 정확히 이해하기★
    - WHERE: 각 행에 대한 조건 적용
    - HAVING: GROUP BY에 대한 조건이기 때문에 여러 행을 그룹화한 후 값을 계산
      
            SELECT B.USER_ID, B.NICKNAME, SUM(A.PRICE) AS TOTAL_SALES
                    FROM USED_GOODS_BOARD AS A INNER JOIN USED_GOODS_USER AS B
                    ON A.WRITER_ID = B.USER_ID
                    WHERE STATUS = 'DONE'
                    AND SUM(A.PRICE) >= 700,000 ※
                    GROUP BY 1
                    ORDER BY 3;

- 수정한 코드
  
          SELECT B.USER_ID, B.NICKNAME, SUM(A.PRICE) AS TOTAL_SALES
            FROM USED_GOODS_BOARD AS A INNER JOIN USED_GOODS_USER AS B
            ON A.WRITER_ID = B.USER_ID
            WHERE STATUS = 'DONE'
            GROUP BY 1,2
            HAVING TOTAL_SALES >= 700000 ★
            ORDER BY 3;
  
