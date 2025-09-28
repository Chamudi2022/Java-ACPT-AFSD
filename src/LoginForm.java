import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "admin@gmail.com";
        int dbPassword = 12345;

        System.out.print("Enter Your Email: ");
        String userEmail = scan.next();

        System.out.print("Enter Your Password: ");
        int userPassword = scan.nextInt();

        if (dbEmail.equals(userEmail) && dbPassword==userPassword){
            System.out.println("Login Success ");
        }else{
            System.out.println("Login Failed ");
        }

    }
}


//get email and password from user
//check they are matched with dbEmail and dbPassword
//if matched display Login success ! if not
//Login Failed !