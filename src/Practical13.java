import java.util.Scanner;

public class Practical13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String userName = scan.next();


        System.out.print("Enter Your Age: ");
        int userAge = scan.nextInt();


        for (int i=0; i<12; i++){
            System.out.print("Enter Girl's Name " + (i+1) + ": ");
            String girlName = scan.next();


            System.out.print("Enter Girl's Age " + (i+1) + ": ");
            int girlAge = scan.nextInt();


            char userAsciLetter = userName.charAt(0);
            int userAsciValue = userAsciLetter;

            char girlAsciletter = girlName.charAt(0);
            int girlAsciValue = girlAsciletter;

            if (userAsciValue>=girlAsciValue && girlAge<userAge){
                System.out.println("Matched ");
                break;

            }else {
                System.out.println("Not Matched ");
            }

        }
    }
}


//1) Take your name and age as user input
//2) 10 girls can insert their name and age in 10 round
//3) the asci value of the first letter of your name should less than or equals to any girl's ascii value(first letter of the name)
//4) and age should less than girl age
//5) these are ok, print matched  ---> not ok, print not matched
//6) if found application should stop


