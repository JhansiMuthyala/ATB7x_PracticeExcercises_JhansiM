package JUL.ATB7X_14072024;

public class Ex_056 {
    public static void main(String[] args) {
        //Lab_074
        String name = "The Testing Academy";//SCP
        String name1 = "The Testing Academy";//SCP
        // here in SCP data Stored is 1
        String name2 = new String("The Testing Academy" );//Heap Area
        String name3 = new String("The Testing Academy" );// Heap Area
        // Here in Heap Area data stored is 2

        System.out.println(name == name1);/// check for reference
        System.out.println(name.equals(name1));// Check for Content


        System.out.println(name1==name2);// here refrence between h1 and h2
        System.out.println(name1.equals(name2));

    }
}
