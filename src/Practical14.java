import java.util.Scanner;

public class Practical14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String dbUsername = "Admin";
        int dbUserPassword = 12345;

        System.out.print("Enter Your User Name: ");
        String userName = scan.next();

        System.out.print("Enter Your Password: ");
        int userPassword = scan.nextInt();


        if(dbUsername.equals(userName) && dbUserPassword==userPassword){

            System.out.print("Enter Your Expected People Count Today: ");
            int peopleCount = scan.nextInt();



            String sim1 = "Dialog";
            String sim2 = "Mobitel";
            String sim3 = "Airtel";

            int dialogCount = 0;
            int mobitelCount = 0;
            int airtelCount = 0;


            for (int i=0; i<peopleCount; i++) {
                System.out.print("Do Your Phone has sims: ");
                int simCount = scan.nextInt();
                for (int j = 0; j<simCount; j++) {
                    System.out.print("Sim Card Name: ");
                    String simName = scan.next();

                    if (simName.equals(sim1)) {

                        dialogCount++;

                    } else if (simName.equals(sim2)) {
                         mobitelCount++;
                        
                    } else if (simName.equals(sim3)) {
                        airtelCount++;
                    }

                }

            }

            if (dialogCount>=mobitelCount && dialogCount>=airtelCount){
                System.out.println("Most Populare Sim " + sim1);
            } else if (mobitelCount>=dialogCount && mobitelCount>=airtelCount) {
                System.out.println("Most Popular Sim " + sim2);
            }
            else{
                System.out.println("Most Popular Sim: " + sim3);
            }

            }
        }


    }

