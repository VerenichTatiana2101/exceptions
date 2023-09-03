package homeWork2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
         *  и возвращает введенное значение. 
         * Ввод текста вместо числа не должно приводить к падению приложения, 
         * вместо этого, необходимо повторно запросить у пользователя ввод данных.
         */
        requestDouble();

    }

    public static Float requestDouble(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробноe числo через запятую: ");
        while (!sc.hasNextFloat()) {
            System.out.println("Ошибка ввода данных, попробуйте ещё раз: ");
            sc.next();
        }
        Float result = sc.nextFloat();
        System.out.println("Введено дробное число: " + result);
        sc.close();
        return result;
    }
}
