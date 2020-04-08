package bat.coding.java.ExceptionsJR.SingleExceptions;

public class ExceptionString {
    public static void main(String[] args) {
        String m = null;
        try {
            String s = null;
            m = s.toLowerCase();
        } catch (NullPointerException e){
            System.out.println("Mistake is noticed!");
            System.out.println(m);
        }
    }
}
