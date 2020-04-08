package bat.coding.java.ExceptionsJR;

import java.util.ArrayList;

public class ExceptionList {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Add elements and then try to get them!");
        }
    }
}
