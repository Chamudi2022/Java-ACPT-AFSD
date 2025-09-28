import java.util.Scanner;

public class Practical16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        while (num>0){
           int lastDigit = num%10;   //bedala ithiriwena sankayawa
            System.out.print(lastDigit);
            num = num/10; //ilagata bedanna thiyena number eka

        }
    }
}
