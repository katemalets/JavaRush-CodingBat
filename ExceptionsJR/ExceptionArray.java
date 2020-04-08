package bat.coding.java.ExceptionsJR;

public class ExceptionArray {
    public static void main(String[] args){
        try{
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Sorry, array size is 3");
        }
    }
}
