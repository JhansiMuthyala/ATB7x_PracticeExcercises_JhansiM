package ATB7X_27072024;

public class Ex_122 {
    //Lab_142
    public static void main(String[] args) {
        final int[] ages = new int[4];// value in index 4 is final
        ages[3] = 78;  // value for index 3 is defined = 78
        System.out.println(ages[3]);

        final int a = 10;// cannot be modified further
        //a = 90;
    }
}
