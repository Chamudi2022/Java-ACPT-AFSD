import java.util.Scanner;

public class Practical15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scan.next();

        int age;

       System.out.print("Enter Your Age: ");
       age = scan.nextInt();

        while (age>100){
                 System.out.print("Enter Your Age again Your age is greater than 100: ");
                 age = scan.nextInt();

        }

        System.out.print("Enter Your Address: ");
        String address = scan.next();

        System.out.print("Enter Your Telephone No: ");
        String tNumber = scan.next();
    }
}
