package bat.coding.java.ExceptionsJR.MultipleExceptions;

public class ExceptionCatch {
    public static void main(String[] args) {

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