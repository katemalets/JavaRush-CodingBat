package bat.coding.java.ExceptionsJR.SingleExceptions;

import java.util.HashMap;

public class ExceptionMap {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("NULLNULLNULL");
        }
    }
}
