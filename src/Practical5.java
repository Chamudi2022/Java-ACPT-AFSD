import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Boy Age: ");
        int boyAge = scan.nextInt();

        System.out.print("Enter Girl Age: ");
        int girlAge = scan.nextInt();

        if (boyAge>girlAge){
            System.out.print("Enter Boy Name: ");
            String boyName = scan.next();

            System.out.print("Enter Girl Name");
            String girlName = scan.next();

            char boyFirstLetter = boyName.charAt(0);
            char girlFirstLetter = girlName.charAt(0);

            int boyFirstLetterAsciValue = boyFirstLetter;
            int girlFirstLetterAsciValue = girlFirstLetter;

            if (boyFirstLetterAsciValue>girlFirstLetterAsciValue){
                System.out.println("Definetely Married");
            }
            else {
                System.out.println("Defenitely Not Married");
            }


        } else if (boyAge==girlAge) {
            System.out.print("Think Twice");

        }
        else{
            System.out.print("Not Marriage");
        }
    }
}
