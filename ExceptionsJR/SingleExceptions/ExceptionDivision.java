package bat.coding.java.ExceptionsJR.SingleExceptions;

public class ExceptionDivision {
    public static void main(String[] args) {
        int a = 0, b = 54;
        double c = 0.0;
        try {
            System.out.println(b / a);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(b / c);
        } finally {
            System.out.println("We are finished");
        }
    }
}
