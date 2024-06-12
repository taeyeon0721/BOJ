-- 코드를 입력하세요
SELECT MCDP_CD AS '진료과 코드', COUNT(*) AS '5월 예약건수'
    FROM APPOINTMENT
    WHERE DATE_FORMAT(APNT_YMD,'%Y-%m') = '2022-05'
    GROUP BY 1
    ORDER BY `5월 예약건수`,`진료과 코드`;