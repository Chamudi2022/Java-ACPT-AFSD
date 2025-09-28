import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1");
        int val1 = scan.nextInt();

        System.out.print("Enter number 2");
        int val2 = scan.nextInt();

        System.out.print("Enter number 3");
        int val3 = scan.nextInt();

        if (val1>val2 && val3==10){
            System.out.println("Hello");
        }
        else{
            System.out.println("Hi");
        }

    }
}
