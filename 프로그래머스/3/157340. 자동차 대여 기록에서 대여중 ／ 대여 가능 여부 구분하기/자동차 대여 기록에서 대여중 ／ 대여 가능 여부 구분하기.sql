-- MAX값이 핵심★
-- MAX를 쓰지 않으면 CAR_ID당 대여기록이 여러개 있을 때 여러행 반환해버림
-- GROUP BY CAR_ID별로 MAX값을 구해야 대여중인 경우가 하나라도 있을 때, 대여 가능보다 더 큰 문자열인 대여중을 반환

-- CASE WHEN 사용★

SELECT CAR_ID,
    MAX(CASE 
            WHEN DATE '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
            ELSE '대여 가능'
        END) AS 'AVAILABILITY'
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    GROUP BY CAR_ID
    ORDER BY CAR_ID DESC;
