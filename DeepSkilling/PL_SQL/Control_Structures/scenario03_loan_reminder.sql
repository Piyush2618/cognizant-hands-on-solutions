DECLARE
    CURSOR c_due IS
        SELECT c.Name,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
          ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR loan IN c_due LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loan.Name
            || ', your Loan ID '
            || loan.LoanID
            || ' is due on '
            || TO_CHAR(loan.DueDate, 'DD-MON-YYYY')
        );

    END LOOP;
END;
/