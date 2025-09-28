import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //array
        //type safe ----> same data type
        //fixed length

        int age = 5;  //single
        System.out.println(age);

        int[] ages = new int[10];

        ages[3] = 54;  // 54 value eka  3rd index ekata daanna

        System.out.println(ages[0]);

        /// /////////////////////////////////////////////////////////

        ages[0] = 90;
        ages[1] = 25;
        ages[2] = 30;

        for (int i=0; i<10; i++){
            System.out.println("Enter value for variable " + i);
            ages[i] = scan.nextInt();
        }


        /// //////////////////////////////////////////////////////
        for (int i=0; i<10; i++){
            System.out.println(ages[i]);
        }



    }
}
