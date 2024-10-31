import java.util.Date;

class Payslip {
    private Date issueDate;
    private double grossPay;
    private double deductions;
    private double netPay;

    public Payslip(Date issueDate, double grossPay, double deductions, double netPay) {
        this.issueDate = issueDate;
        this.grossPay = grossPay;
        this.deductions = deductions;
        this.netPay = netPay;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getDeductions() {
        return deductions;
    }

    public double getNetPay() {
        return netPay;
    }

    public void displayPayslip() {
        System.out.println("-------------PaySlip------------");
        System.out.println("| Issue Date: " + issueDate+ " |");
        System.out.println("| Gross Pay:  $" + grossPay+  " |");
        System.out.println("| Deductions:  $" + deductions + " |");
        System.out.println("| Net Pay:  $" + netPay + " |");

    }
}
