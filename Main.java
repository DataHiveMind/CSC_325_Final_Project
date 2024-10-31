import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Map<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("What is the name of employee?: ");
        String name = input.nextLine();

        System.out.print("What is the salary of employee?: ");
        double salary = input.nextDouble();

        System.out.print("Hours Worked?: ");
        int hours = input.nextInt();

        System.out.print("What is the deduction percentage(in decimals):? ");
        double percentage = input.nextDouble();

        double deduct = salary * percentage;
        double netpay = salary - deduct;

        Random random = new Random();
        int id = random.nextInt(0,1000);

        Employee emp = new Employee(name, id, hours);
        emp.addPayslip(new Payslip(new Date(), salary, deduct, netpay));

        Employee emp2 = new Employee("Jane Doe", 102, 29);
        emp2.addPayslip(new Payslip(new Date(), 3200.00, 550.00, 2650.00));

        employees.put(emp.getId(), emp);
        employees.put(emp2.getId(), emp2);

        List<Payslip> payslips = viewPayslips(emp.getId());
        List<Payslip> payslips1 = viewPayslips(emp2.getId());

        for (Payslip p : payslips) {
            emp.displayEmployee();
            p.displayPayslip();
            System.out.println();
        }
        for(Payslip p1 : payslips1) {
            emp2.displayEmployee();
            p1.displayPayslip();
        }
    }

    public static List<Payslip> viewPayslips(int employeeId) {
        if (employees.containsKey(employeeId)) {
            return employees.get(employeeId).getPayslips();
        }
        return new ArrayList<>();
    }
}
