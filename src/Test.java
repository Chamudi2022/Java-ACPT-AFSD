import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String userName = scan.next();

        System.out.print("Enter Your Age: ");
        int userAge = scan.nextInt();
        
        if (userAge>18){
            System.out.print("Your are eligible");
        } else if (userAge<=18 && userAge>=15) {
            System.out.print("Your are not eligible");
        }
        else{
            System.out.print("Call the Police");
        }
    }
}
