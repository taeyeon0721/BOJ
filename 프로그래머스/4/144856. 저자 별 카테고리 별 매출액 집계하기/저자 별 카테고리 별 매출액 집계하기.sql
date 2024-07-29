-- 코드를 입력하세요
SELECT A.AUTHOR_ID
    ,AUTHOR_NAME
    ,CATEGORY
    ,SUM(PRICE*SALES) AS TOTAL_SALES 
    FROM BOOK B
    JOIN AUTHOR A
    ON B.AUTHOR_ID = A.AUTHOR_ID
    JOIN BOOK_SALES S
    ON B.BOOK_ID = S.BOOK_ID
    WHERE SALES_DATE LIKE ('2022-01%')
    GROUP BY AUTHOR_ID, AUTHOR_NAME, CATEGORY
    ORDER BY AUTHOR_ID, CATEGORY DESC;