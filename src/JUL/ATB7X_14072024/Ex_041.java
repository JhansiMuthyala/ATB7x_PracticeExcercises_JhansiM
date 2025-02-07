package JUL.ATB7X_14072024;

public class Ex_041 {
    public static void main(String[] args) {
        // Lab_058
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);
// here we will loose .45f data


    }

}
