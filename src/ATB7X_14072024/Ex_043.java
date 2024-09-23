package ATB7X_14072024;

public class Ex_043 {
    public static void main(String[] args) {
// Lab_60

        // Increment (++) / Decrement (--) Operators
        // Pre and Post
        // Ready

        // pre - increment ++operand
        // value is incremented first and then stored in the result.
       int a_pre = 10;
        int b = ++a_pre; // a = a+1;
       // Exp = 11 , a = 11
       System.out.println(a_pre);
        System.out.println(b);


// Explanation - Exp
        int a1 = 10;
        System.out.println(++a1);
//        // Exp = 11 , a = 11


        // POST
        //  value is stored in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        // Exp = 10 , a = 11



    }
}
