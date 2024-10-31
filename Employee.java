import java.util.ArrayList;
import java.util.List;

class Employee{
    private String name;
    private int id;
    private List<Payslip> payslips;
    private int hours;

    public Employee(String name, int id, int hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.payslips = new ArrayList<>();
    }

    public void addPayslip(Payslip payslip) {
        this.payslips.add(payslip);
    }

    public List<Payslip> getPayslips() {
        return this.payslips;
    }

    public String getName() {
        return name;
    }

    public int getHours(){
        return hours;
    }

    public int getId() {
        return id;
    }

    public void displayEmployee(){
        System.out.println("Name: " + name + " ID: " + id + " Hours: " + hours);
    }
}
