import java.util.Scanner;

public class Practical17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] marks = new int[11];

        for (int i=0; i<11; i++){
            System.out.print(" Enter Player" + (i+1) +  " running marks: " );
            marks[i] = scan.nextInt();
        }

        int total = 0;
        for (int i=0; i<11; i++){
            total += marks[i];
        }

        //calculate average
        double average = (double) total/11;
        System.out.println("Marks Average: " +average);

        int maxScore = marks[0];

        for (int i=1; i<11; i++){
            if (marks[i]>maxScore){
                maxScore = marks[i];

            }
        }

        System.out.println("Highest Score: " + maxScore);

    }
}
