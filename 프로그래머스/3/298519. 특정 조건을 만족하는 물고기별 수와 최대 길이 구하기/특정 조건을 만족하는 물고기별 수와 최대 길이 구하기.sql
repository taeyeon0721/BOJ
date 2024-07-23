-- 코드를 작성해주세요
SELECT COUNT(FISH_TYPE) AS FISH_COUNT
        , MAX(LENGTH) AS MAX_LENGTH
        , FISH_TYPE 
    FROM FISH_INFO
    GROUP BY FISH_TYPE
    HAVING AVG(IFNULL(LENGTH,10)) >= 33
    ORDER BY 3;

-- ★ [IFNULL을 사용하는 이유] ★
-- "NULL 값이 포함된 컬럼"에서 "평균을 계산할 때 NULL 값은 무시"된다.
-- 따라서, <NULL 값을 특정 값으로 대체>하여 <평균 계산에 포함>시키고 싶을 때 IFNULL을 사용한다. 
-- 이렇게 하면 NULL 값 때문에 평균이 과도하게 낮아지는 것을 방지할 수 있다.
