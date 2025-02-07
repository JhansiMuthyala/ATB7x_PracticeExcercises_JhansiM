package JUL.ATB7X_07072024;

public class Ex_005 {
    // Can I run class without a main method?
    // run option?
    static public void  main(String[] args) {
        System.out.println("with PSVM String");
        // only this is collect main class and it will only run
    }
    public static void main() {
        System.out.println("without PSVM String");

    }
    public static void main(String args) {
        System.out.println("without PSVM String[]");

    }
    public static void main(int[] args) {
        System.out.println("without PSVM int[]");

    }
}

