package JUL.ATB7X_14072024;

public class Ex_040 {
    public static void main(String[] args) {
  // Lab_057

        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - GC
    }
}
