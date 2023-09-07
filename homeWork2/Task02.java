package homeWork2;

public class Task02 {
    public static void main(String[] args) {
        /*
         * исправьте данный код
         * try {
         * int d = 0;
         * double catchedRes1 = intArray[8] / d;
         * System.out.println("catchedRes1 = " + catchedRes1);
         * } catch (ArithmeticException e) {
         * System.out.println("Catching exception: " + e);
         * }
         */

        int[] intArray = {3, 5, 7, 4, 6, 12};
        catchMethod(intArray, 2, 5);

    }

    public static void catchMethod(int[] intArray, int d, int index) {
        if (d == 0)
            throw new ArithmeticException("Делить на ноль нельзя");
        try {
            double catchedRes1 = intArray[index] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }   
    }
}
