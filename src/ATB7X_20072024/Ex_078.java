package ATB7X_20072024;

public class Ex_078 {
    public static void main(String[] args) {
        //Lab_098
        // JDK > 13

        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }

    }

