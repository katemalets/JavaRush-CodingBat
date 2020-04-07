package bat.coding.java.ExceptionsJR;

public class ExceptionString {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e){
            System.out.println("Mistake is noticed!");
        }
    }
}
