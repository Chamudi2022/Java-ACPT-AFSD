import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter Employee1 Salary: ");
        double empSalary1 = scanner.nextDouble();

        System.out.print(" Enter Employee2 Salary: ");
        double empSalary2 = scanner.nextDouble();

        System.out.print(" Enter Employee3 Salary: ");
        double empSalary3 = scanner.nextDouble();

        System.out.print(" Enter Employee4 Salary: ");
        double empSalary4 = scanner.nextDouble();

        System.out.print(" Enter Employee5 Salary: ");
        double empSalary5 = scanner.nextDouble();

        System.out.println("Average Salary is: " + ((empSalary1+empSalary2+empSalary3+empSalary4+empSalary5/5)));
    }
}
