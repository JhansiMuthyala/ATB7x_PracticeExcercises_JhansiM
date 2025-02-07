package JUL.ATB7X_20072024;

import java.util.Scanner;

public class Ex_083 {
    public static void main(String[] args) {
        //Lab_103
        // Program to Check
        // if a Number is Positive
        // , Negative,
        // or Zero.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yur number!");
        int num = sc.nextInt();


        if(num> 0 ){
            System.out.println("Positive Number");
        }else if( num < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
    }
}
