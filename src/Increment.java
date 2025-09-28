public class Increment {
    public static void main(String[] args) {

        int val = 32;
        val+=3;   // val = val + 3
        System.out.println(val);

        int val1 = 23;
        ++val1;  // val1+=1;   -------> Increment Operator
        System.out.println(val1);

        int val2 = 28;
        System.out.println(val2++); //post increment waladi, exisisting value ekata ekak ekathu wenawa

        int val3 = 28;
        System.out.println(++val3); //pre increment waladi, exisisting value ekata ekak ekathu nowe.

    }
}
