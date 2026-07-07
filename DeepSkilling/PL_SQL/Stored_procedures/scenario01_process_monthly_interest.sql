CREATE OR REPLACE PROCEDURE ApplyMonthlyInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + Balance * 1 / 100
    WHERE AccountType = 'SAVINGS';

    COMMIT;
END;
/