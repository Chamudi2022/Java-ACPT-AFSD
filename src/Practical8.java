import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String userName = scan.next();

        System.out.print("Enter Your Age: ");
        int userAge = scan.nextInt();

        System.out.print("Enter Married Status: ");
        boolean isMarried = scan.hasNextBoolean();


        char userNameFirstLetter = userName.charAt(0);
        int userNameFirstLetterAsciValue = userNameFirstLetter;



        if (userAge>=18){
            if (userNameFirstLetterAsciValue>=70 && isMarried){
                System.out.print("OK , Eligible ");

            }
            else {
                System.out.print("Not Eligible ");
            }
        }else{
            System.out.println("You are not eligible, age is not enough ");
        }

    }
}


//user input name,age,isMarried
//age greater than or equal to 18 continue app it not display you are not eligible, age is not enough.
//if age is ok, check the asci value of first letter of user's name is greater than or equals 70 And user is married
//condition ok nam, ok , eligible
//condition not ok nam, nit eligible