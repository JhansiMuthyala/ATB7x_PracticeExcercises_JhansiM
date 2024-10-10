package Assignements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class triangleclassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side a ");
        int a = sc.nextInt();
        System.out.println("Enter Side b ");
        int b = sc.nextInt();
        System.out.println("Enter Side c ");
        int c = sc.nextInt();
    if(a==b && b==c){
        System.out.println("Equilateral Traingle");
    } else if (a==b || b==c || c==a) {
        System.out.println("Isosceles Traingle");

    }else {
        System.out.println("Scalene Traingle");
    }

    }

}
