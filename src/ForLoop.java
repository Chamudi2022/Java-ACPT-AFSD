import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        //loops -----> for loop, while loop, do-while loop, for-each loop

        Scanner scan = new Scanner(System.in);

        double totalSalary = 0.00;

        //for loop
        for (int i=0; i<5; i++){
            System.out.print("Enter Employee Salary: ");
            totalSalary += scan.nextDouble();


//            if (totalSalary>=100000){
//                break;
//            }

        }
        System.out.println("Average Salary: " + totalSalary/5);
    }
}
