//plug Scanner
import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Employee Count: ");
        int employeeCount = scan.nextInt();

        System.out.print("Enter employee1 Salary: ");
        double employeeSalary1 = scan.nextDouble();

        System.out.print("Enter Employee2 Salary: ");
        double employeeSalary2 = scan.nextDouble();

        System.out.print("Enter Employee3 Salary: ");
        double employeeSalary3 = scan.nextDouble();

        System.out.print("Enter Employee4 Salary: ");
        double employeeSalary4 = scan.nextDouble();

        //user input

        double employeeAverageSalary = (employeeSalary1+employeeSalary2+employeeSalary3+employeeSalary4)/employeeCount;
        System.out.println("Employee Average Salary: " + employeeAverageSalary);

       // System.out.println(num1 + num2);  arithmetic addition

       // System.out.println("Answer is - " + num1 + num2); String concat
       // System.out.println("Answer is - " + (num1 + num2)); Arithmetic operation


        //there are 4 employees in orange (pvt) ltd
        //get their salaries as user inputs
        //then find the average salary of an employee



    }
}
