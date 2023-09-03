package homeWork2;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
         * Разработайте программу, которая выбросит Exception,
         * когда пользователь вводит пустую строку.
         * Пользователю должно показаться сообщение,
         * что пустые строки вводить нельзя
         */

        requestString();

    }

    public static void requestString() {
        System.out.println("Введите что-нибудь: ");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        if (result.isEmpty()) {
            sc.close();
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        System.out.println("Введено: " + result);
        sc.close();
    }

    // public static String requestString(){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Введите что-нибудь: ");
    // while (!sc.hasNext()) {
    // System.out.println("Ввод пуст, попробуйте ещё раз: ");
    // sc.next();
    // }
    // String result = sc.next();
    // System.out.println("Введено: " + result);
    // sc.close();
    // return result;
    // }

}
