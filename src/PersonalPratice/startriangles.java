package PersonalPratice;

public class startriangles {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("*");
            }
            if (i == 2) {
                System.out.println("**");

            }
            if (i == 3) {
                System.out.println("***");

            }
            if (i == 4) {
                System.out.println("****");

            }
            if (i == 5) {
                System.out.println("*****");

            }

        }
        System.out.println("-----------Triangle ascending End----------");

        for (int i = 5; i >= 1; i--) {
            if (i == 1) {
                System.out.println("*");
            }
            if (i == 2) {
                System.out.println("**");

            }
            if (i == 3) {
                System.out.println("***");

            }
            if (i == 4) {
                System.out.println("****");

            }
            if (i == 5) {
                System.out.println("*****");

            }


        }
        System.out.println("-----------Triangle descending End----------");

    }
}
