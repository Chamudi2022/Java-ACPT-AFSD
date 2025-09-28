import java.util.Scanner;

public class Practical11 {
    public static void main(String[] args) {

        boolean isLoginSuccess = false;

        Scanner scan = new Scanner(System.in);

        String dbUserName = "admin";
        int dbPassword = 12345;

        System.out.print("Enter Your User Name: ");
        String userName = scan.next();


        for(int i=0; i<5;i++){

            System.out.print("Enter Your Password: ");
            int userPassword = scan.nextInt();


            if (dbUserName.equals(userName) && dbPassword==userPassword){
//                System.out.println("Login Success ");
                isLoginSuccess = true;
                break;

            }

            System.out.println("Your have to try again user credentials..");

            if (i==4){
                System.out.println("Your have been locked");
            }

        }

        if (isLoginSuccess){
            //logical part
            System.out.print("Enter Your Name: ");
            String name = scan.next();

            System.out.print("Enter Your Age: ");
            int age = scan.nextInt();

            System.out.print("Enter Your Lagna: ");
            String lagna = scan.next();

            if (age>=18){
                char userNameFirstLetter = name.charAt(0);
                int userNameFirstLetterAsciValue = userNameFirstLetter;

                String results;

                if (userNameFirstLetterAsciValue % 2 ==0) {
                    results = " ඔබ වාසනාවන්තය. ඔබේ ලග්න ප්තිපලය :  ";
                }
                else {
                    results = " ඔබ අවාසනාවන්තයි. ඔබේ ලග්න ප්තිපලය : ";
                }

                switch (lagna){
                    case "මේෂ":
                        System.out.println(name + results + " යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්.");
                        break;
                    case "වෘෂභ":
                        System.out.println(name + results + " අන් අයගේ සිත් දිනා ගනී");
                        break;
                    case "මිථුන":
                        System.out.println(name + results +
                                " ස ිත නිතර චංචල වී, දුක් සහිත අත්දැකීම්");
                        break;
                    case "කටක":
                        System.out.println(name + results + " අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි. ");
                        break;
                    case "සිංහ":
                        System.out.println(name + results + " වස්තුව සහ සැප සම්පත් ලඟා වේ ");
                        break;
                    case "කන්ා":
                        System.out.println(name + results + " දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම ");
                        break;
                    case "තුලා":
                        System.out.println(name + results + " හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය. ");
                        break;
                    case "වෘශ්චික":
                        System.out.println(name + results + " විවාහය අපේක්ෂකයින් ශුභයි ");
                        break;
                    case "ධනු":
                        System.out.println(name + results + " රහස් සතුරන් සහ හීන වන ශරීර සෞඛ් ");
                        break;
                    case "මකර":
                        System.out.println(name + results + " අධ්යාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට ");
                        break;
                    case "කුම්භ":
                        System.out.println(name + results + " පවුලේ සමගිය සහ සතුට ");
                        break;
                    case "මීන":
                        System.out.println(name + results + " ඔබේ දක්ෂතා ක්රියාවෙන්ම ඔප්පු කර පෙන්වීමට ");
                        break;
                    default:
                        System.out.println(" Not Match any of the Item");
                }

            }

            else {
                System.out.println("Age is not enough");
            }
        }

        }

    }

