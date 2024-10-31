# CSC_325_Final_Project
# Scenario 1: Employee Views Payslip
Given the employee has logged into the Payroll Application
And the employee has been issued at least one payslip
When the employee navigates to the "Payslip" section
Then the employee should see a list of available payslips
And the employee should be able to view the details of a selected payslip, including gross pay, deductions, and net pay.

# Scenario 2: Manager Manages Employee Benefits
Given the manager has logged into the Payroll Application
And the manager has access to employee records
When the manager navigates to the "Benefits" section for a specific employee
Then the manager should be able to update the employee's insurance and retirement plan details
And the changes should be reflected in the employee's profile.

# Scenario 3: Employee Receives Timely Payment
Given the employee has valid bank account and routing details registered in the system
When it is the scheduled payday
Then the payroll application should automatically process the payment
And the employee should receive the amount in their bank account via direct deposit.

# Scenario 4: Admin Updates Employee Records
Given the admin has logged into the Payroll Application and the admin has the necessary permissions
. When the admin navigates to the "Employee Management" section and selects an employee to update
Then the admin should be able to add, update, or remove employee records and the changes should be reflected in real-time across the system.

# Scenario 5: Employee Views Yearly Earnings Summary
Given the employee has logged into the Payroll Application, When the employee navigates to the "Yearly Summary" section. Then the employee should see a detailed summary of earnings for the current year and the summary should include total earnings, taxes paid, and savings contributions for tax planning.
