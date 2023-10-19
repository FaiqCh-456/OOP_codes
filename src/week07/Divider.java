package week07;

public class Divider {
//    public static int divideNumbers(int a, int b) throws ArithmeticException {
//        return a / b;
//    }

    public static void ArithmeticException(int a, int b) {
        int r;
        try {
            System.out.println("enter two numbers to divide");
            r= a/b;
            System.out.println("a/b = " + r);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}