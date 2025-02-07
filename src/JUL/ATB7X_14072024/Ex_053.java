package JUL.ATB7X_14072024;

public class Ex_053 {
    public static void main(String[] args) {
        //Lab_070
        String s1 = new String("Jhansi");
        String s2 = new String("Muthyala");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Jhansi

    }
}
