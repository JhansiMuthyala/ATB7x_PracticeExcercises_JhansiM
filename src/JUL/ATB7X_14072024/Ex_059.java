package JUL.ATB7X_14072024;

public class Ex_059 {
    //LAb_078
    public static void main(String[] args) {


        String password = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
// pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Pramod@123 =  pramod@123  = PRamod@123 = PraMod@123

        System.out.println(password.substring(0, 3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());

    }
}