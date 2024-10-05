package Assignements;

import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2");
        int num2 = sc.nextInt();
        System.out.println("Enter Num3");
        int num3 = sc.nextInt();
        if(num1>num2){
            if(num2>num3){
                System.out.println(num1+" Num1 is largest");
            }
        }
        else if(num2>num1){
            if(num2>num3){
                System.out.println(num2+" Num2 is largest");

            }
        }
        else {
            System.out.println(num3+" Num3 is largest");

        }
    }
}
