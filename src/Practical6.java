import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int pepoleAge = scan.nextInt();

        if (pepoleAge<=18){
            System.out.println("Your are a Child");
        } else if (pepoleAge>=19 && pepoleAge<=30) {
            System.out.print("Your are a Younger");
        } else if (pepoleAge>=31 && pepoleAge<=60) {
            System.out.print("Your are a Adult");
        }
        else {
            System.out.print("Your are a Senior Adult");
        }
    }
}

//alert