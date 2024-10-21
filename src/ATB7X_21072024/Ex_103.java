package ATB7X_21072024;

public class Ex_103 {
    //Lab_123
    public static void main(String[] args) {

       // even and odd number from 1 to 50
        for (int i = 0; i <= 50; i++) { // i = 0 to 50, times  = 51
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> "+ i);
        }
    }
}