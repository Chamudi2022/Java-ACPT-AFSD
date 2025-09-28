import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Buissnes1 Monthly Income: ");
        double buisnessOneIncome = scan.nextDouble();

        System.out.print("Enter Buisness2 Monthly Income: ");
        double buisnessTwoIncome = scan.nextDouble();

        System.out.print("Enter Buissness3 Monthly Income: ");
        double buisnessThreeIncome = scan.nextDouble();

        System.out.print("Enter Buissness4 Monthly Income: ");
        double buisnessFourIncome = scan.nextDouble();

        double averageMonthlyIncome = (buisnessOneIncome+buisnessTwoIncome+buisnessThreeIncome+buisnessFourIncome)/4;
        System.out.println("Buisness August Month Average Income " + averageMonthlyIncome);

        double buisnessmenOneIncome = (buisnessOneIncome*13)/100;
        System.out.println(buisnessmenOneIncome);

        double buisnessmenTwoIncome = (buisnessTwoIncome*13)/100;
        System.out.println(buisnessmenTwoIncome);

        double buisnessmenThreeIncome = (buisnessThreeIncome*13)/100;
        System.out.println(buisnessmenThreeIncome);

        double buisnessmenFourIncome = (buisnessFourIncome*13)/100;
        System.out.println(buisnessmenFourIncome);

        double totalTaxAmount = buisnessmenOneIncome+buisnessmenTwoIncome+buisnessmenThreeIncome+buisnessmenFourIncome;
        System.out.println("Buisnessmen Tax Amount " + totalTaxAmount);


        //there are 4 buisnessmen in city
        //take their august month income as user inputs
        //find their average monthly income
        //every employee should pay 13% tax from their income
        //find the total tax value they pay for government


        //size eken podi data type variable ekak size eken loku data type variable ekakata damima conversion lesa hadunwanawa.
        //conversion
        byte num1 = 10;
        int num2 = num1;
        System.out.println(num2);

        //size eken podi data type variable ekak athukata size eken loku data type variable ekak damima casting lesa hadunwanawa.
        //ewita balen size eke loku datatype variable eke datatype eka size eken adu datatype variable eka bawata convert karanna oni. warahan daala.
        //casting
        int num3 = 20;
        byte num4 = (byte) num3;
        System.out.println(num4);

        //byte range -128 sita 127 dakawa. 132 thiyenne range eken pita. enisa rina
        int value1 = 132;
        byte value2 = (byte)value1;
        System.out.println(value2);

    }

}
