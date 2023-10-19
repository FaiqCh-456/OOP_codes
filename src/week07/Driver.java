package week07;


import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Welcome my friend ");

        Scanner scanner = new Scanner(System.in);
        int arr [] ={0,1,2,3};

        try{

            System.out.println("enter two number to divide ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("a/b = "  + a/b);
            System.out.println("array at index 4");
            System.out.println(arr[4]);
        }

        catch (ArithmeticException e){

            System.out.println("Arithmetic Exception");

        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Array index out of bound error");
        }

        finally {
            System.out.println("In finally block");

        }
        System.out.println("Bubbyeee my friend");

    }
}