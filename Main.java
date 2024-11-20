import java.util.*;

public class Main {
    private static Map<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String name;

        while(true){

        // Finding the name of employee
        System.out.print("What is the name of employee?: ");
        name = input.nextLine();

        if(name instanceof String){
            System.out.println("Empolyee: " + name);
        }
        else{
            System.out.println("Incorrect input, Please enter a string.");
            System.out.print("What is the name of employee?: ");
            input.nextLine();
        }

        // Finding the salary of employee
        System.out.print("Enter the salary of employee?: ");
        double salary;

        if(!input.hasNextDouble()){
            System.out.println("Incorrect input, Please enter a double type.");
            System.out.print("Enter the salary of employee?: ");
            input.next();
        }
        salary = input.nextDouble();
        System.out.println("Salary of employee: " + salary);

        //Finding out hours 
        System.out.print("Enter the employees hours?: ");
        int hours;
        if(!input.hasNextInt()){
            System.out.println("Incorrect input. Please enter an integer.");
            System.out.print("Enter the employees hours?: ");
            input.next();
        }
        hours = input.nextInt();
        System.out.println("hours worked: " + hours);

        // Finding the deductions and taxes on salary
        System.out.print("Enter the deduction percentage(in decimals)?: ");
        double percentage;

        if(!input.hasNextDouble()){
            System.out.println("Incorrect input, Please enter a double type.");
            System.out.print("Enter the deduction percentage(in decimals)?: ");
            input.next();
        }
        percentage = input.nextDouble();
        System.out.println("Deductions and Taxes: " + percentage);

        double deduct = salary * percentage;
        double netpay = salary - deduct;

        int id = rand.nextInt(0,1000);

        Employee emp = new Employee(name, id, hours);
        emp.addPayslip(new Payslip(new Date(), salary, deduct, netpay));


        employees.put(emp.getId(), emp);

        List<Payslip> payslips = viewPayslips(emp.getId());

        for (Payslip p : payslips) {
            emp.displayEmployee();
            p.displayPayslip();
            System.out.println();
        }

        System.out.print("Do you want to run the program again? (yes/no): ");
        String userInput = input.nextLine().toLowerCase();
        if (!userInput.equals("yes")) {
            break;
        }
    }
    input.close();

}

    public static List<Payslip> viewPayslips(int employeeId) {
        if (employees.containsKey(employeeId)) {
            return employees.get(employeeId).getPayslips();
        }
        return new ArrayList<>();
    }
}
