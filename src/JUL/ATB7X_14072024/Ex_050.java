package JUL.ATB7X_14072024;

public class Ex_050 {
    public static void main(String[] args) {
        // Lab_067
        String name = "Jhansi";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Muthyala");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name2.length());

        System.out.println(name2.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name2.charAt(0));
      //  System.out.println(name.charAt(10)); // Exception Index 10 out of bounds

    }
}
