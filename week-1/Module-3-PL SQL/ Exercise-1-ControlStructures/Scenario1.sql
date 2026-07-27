SET SERVEROUTPUT ON;

DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, DOB
        FROM Customers;

    v_age NUMBER;
BEGIN
    FOR cust IN cust_cursor LOOP

        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, cust.DOB) / 12);

        IF v_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest rate updated for Customer ID: ' || cust.CustomerID
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/
