package week07;

class ArrayHandler {
    public static void Array(int[] arr) {
        try {
            System.out.println("array at index 4");
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound error");
        }
    }
}