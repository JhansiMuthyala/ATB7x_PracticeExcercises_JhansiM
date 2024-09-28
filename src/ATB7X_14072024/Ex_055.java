package ATB7X_14072024;

public class Ex_055 {
    //Lab_073
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = " Guys";
        String str3 = "Hello Guys";
        String str4 = str1.concat(str2); // Hello Guys
        // SCAP -  4
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str4.equals(str3));
        System.out.println(str4==str3);

    }
}
