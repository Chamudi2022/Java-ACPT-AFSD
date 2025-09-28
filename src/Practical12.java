import java.util.Scanner;

public class Practical12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalTax = 0;
        for (int i=0; i<13; i++){
            System.out.print("Employee Salary: ");
            double empSalary = scan.nextDouble();


            if (empSalary>130000){
               double tax = (empSalary/100*14);
               totalTax+=tax;

            }

        }

        System.out.println("Each Employee should pay tax for government: " + totalTax);

    }
}


//there have 12 employee in company
//if employees's salary greater than 120000 should pay 14% tax for government.
//we want to get total tax for each employee