-- 코드를 입력하세요
SELECT ANIMAL_ID, O.NAME
    FROM ANIMAL_INS I RIGHT JOIN ANIMAL_OUTS O 
    USING (ANIMAL_ID)
    WHERE INTAKE_CONDITION IS NULL;