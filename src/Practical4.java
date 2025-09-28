import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Salary Income: ");
        double pSalary = scan.nextDouble();

        System.out.print("Enter Your Property Income: ");
        double pProperty = scan.nextDouble();

        System.out.print("Enter Your Kudu: ");
        double pKudu = scan.nextDouble();

        if(pSalary>=115000){
            pSalary = pSalary - (pSalary/100*14);

        }else if (pKudu>0) {
            pKudu = pKudu/2;

        }


//        print

        System.out.println("final Income " + (pSalary+ pKudu + pProperty));


    }
}
