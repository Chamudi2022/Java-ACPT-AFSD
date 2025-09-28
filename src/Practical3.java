import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Boy's Name: ");
        String boyName = scan.next();

        System.out.print("Enter Girl's Name: ");
        String girlName = scan.next();

        char boyNameFirstLetter = boyName.charAt(0);
        int boyNameAsciValue =  boyNameFirstLetter; //conversion

        char girlNameLastLetter = girlName.charAt(girlName.length()-1);
        int girlNameAsciValue = girlNameLastLetter; //conversion

        System.out.println("Your Lucky Number" + (boyNameAsciValue+girlNameAsciValue)/2);







    }
}

