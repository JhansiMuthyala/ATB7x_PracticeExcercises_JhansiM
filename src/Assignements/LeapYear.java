package Assignements;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = Input.nextInt();
        if(year%4==0) {

            System.out.println("Entered Year is Leap Yr");

        }else {
            System.out.println("Entered Year is Not a Leap Year");

        }
    }
}
