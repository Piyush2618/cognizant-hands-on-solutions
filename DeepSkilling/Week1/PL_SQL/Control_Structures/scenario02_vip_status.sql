DECLARE
    CURSOR c_vip IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;
BEGIN
    FOR rec IN c_vip LOOP

        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Customer '
                              || rec.CustomerID
                              || ' promoted to VIP.');

    END LOOP;

    COMMIT;
END;
/