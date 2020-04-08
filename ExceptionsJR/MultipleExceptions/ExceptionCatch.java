package bat.coding.java.ExceptionsJR.MultipleExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ExceptionCatch {
    public static void main(String[] args) {

       try {
           BufferedReader bufferedReader = new BufferedReader(new FileReader("hgjkbk"));
       } catch (FileNotFoundException e) {
           System.out.println("FILE NOT FOUND EXCEPTION CAUGHT");
       }

       try {
           HashMap<String,String> hashMap = new HashMap<>(null);
       } catch (NullPointerException e) {
           System.out.println("NULL POINTER EXCEPTION CAUGHT");
       }

        try {
            System.out.println(4 / 0);
        } catch (ArithmeticException e) {
            System.out.println("ARITHMETIC EXCEPTION CAUGHT");
            e.printStackTrace();
        }
    }
}

/**
 1. Исключения

 Есть метод, который выбрасывает два исключения, унаследованные от Exception,
 и два унаследованных от RuntimeException: NullPointerException, ArithmeticException,
 FileNotFoundException, URISyntaxException.

 Нужно перехватить NullPointerException и FileNotFoundException,
 но не перехватывать ArithmeticException и URISyntaxException. Как это сделать?
 **/