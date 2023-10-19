package week07;

import week07.ArrayHandler;
import week07.Divider;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome my friend ");

        Scanner scanner = new Scanner(System.in);
        int arr[] = {0, 1, 2, 3};

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Divider.ArithmeticException(a, b);
        ArrayHandler.Array(arr);

        System.out.println("In finally block");
        System.out.println("Bubbyeee my friend");
    }
}