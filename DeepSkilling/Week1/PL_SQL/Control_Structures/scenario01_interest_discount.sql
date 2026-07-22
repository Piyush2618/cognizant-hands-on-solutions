DECLARE
    CURSOR curSenior IS
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60;
BEGIN
    FOR rec IN curSenior LOOP

        UPDATE Loans
        SET InterestRate = InterestRate - (InterestRate * 0.01)
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Discount applied successfully: '
                              || rec.CustomerID);

    END LOOP;

    COMMIT;
END;
/