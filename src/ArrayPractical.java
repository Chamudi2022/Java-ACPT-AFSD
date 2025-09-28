import java.util.Scanner;

public class ArrayPractical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] subjects = new String[9];
        int[] marks = new  int[9];

        for (int i=0; i<9; i++){
            System.out.print("Enter Subject " + (i+1) + ": ");
            subjects[i] = scan.next();

            System.out.print("Enter marks " + "Subject " + (i+1 ) + " Marks: ");
            marks[i] = scan.nextInt();

        }



        int maxMarks = marks[0]; //marks array eke 0 weni index eke value eka
        int maxMarkIndex = 0; //array eke 0 weni index eka


        for (int i=0; i<9; i++){
            if (marks[i] > maxMarks){
             maxMarks = marks[i];
             maxMarkIndex = i;

            }


       }
        System.out.println("Max Mark Subject Name: " + subjects[maxMarkIndex]);



          int total = 0;
          for (int i=0; i<9; i++){
              total += marks[i];
          }

          //calculate average
           double averageMark = (double)total/9;
        System.out.print("Average Marks is " + averageMark);


    }
}


//students has 9 subjects for his ol exam
//get subject names and last term test marks as user inputs
//and store them max marked subject name
//find the average mark of the student