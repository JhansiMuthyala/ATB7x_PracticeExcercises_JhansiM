package JUL.ATB7X_14072024;

public class Ex_058 {
    //lab_076
    public static void main(String[] args) {
        String s1 = "Jhansi";
        //String s1 = "J h a n s i";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat(" Muthyala"); // Jhansi Muthyala
        System.out.println(s1);

    }
}
