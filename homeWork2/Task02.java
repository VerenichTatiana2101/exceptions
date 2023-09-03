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

        int[] intArray = new int[7];
        catchMethod(intArray, 0, 8);


    }

    public static void catchMethod(int[] intArray, int d, int index){
        try {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        } finally {
            System.out.println("я выполнился");
        }
        System.out.println(" я жив! ");
    } 
}
