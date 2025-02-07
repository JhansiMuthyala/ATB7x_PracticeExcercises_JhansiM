package JUL.ATB7X_14072024;

public class Ex_057 {
    //lab_075
    public static void main(String[] args) {
        String s1 = new String("jhansi");
        String s2 = new String("jhansi");
        String s3 = new String("jhansi");


        System.out.println(s1 == s2); // Check for the ref
        System.out.println(s2 == s3); // Check for the ref
        System.out.println(s2.equals(s3)); // Check for the Content

    }
}
