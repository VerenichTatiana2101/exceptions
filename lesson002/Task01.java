package lesson002;

import java.util.Scanner;

public class Task01 {
    /*
     * Посмотрите на этот код. Всё ли с ним хорошо?
     * Если нет, то скорректируйте его и обоснуйте своё решение.
     */

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int[] arr = new int[10];
    // System.out.println("Укажите индекс элемента массива, в который хотите
    // записать значение 1");
    // int index = scanner.nextInt();
    // try {
    // arr[index] = 1;
    // } catch (Exception e) {
    // System.out.println("Указан индекс за пределами массива");
    // }
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        if (index > arr.length)
            System.out.println("Указан индекс за пределами массива");
        else
            index = 1;
        scanner.close();
    }
}
