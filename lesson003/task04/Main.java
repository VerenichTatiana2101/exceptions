package lesson003.task04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
         * Задание №3
         * 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
         * Исключение должно отображать понятное для пользователя сообщение об ошибке.
         * 2. Создайте класс исключений, которое будет возникать при обращении к
         * пустому элементу в массиве ссылочного типа. Исключение должно
         * отображать понятное для пользователя сообщениеоб ошибке
         * 3. Создайте класс исключения, которое будет возникать при попытке открыть
         * несуществующий файл. Исключение должно отображать понятное для
         * пользователя сообщение об ошибке.
         */

        try {
            zeroDiv(); // 1).
            nullElem1(); // 2).
            nullElem2(); /// или
            fileReader(); // 3).

        } catch (ZeroDivException e) {
            System.out.println(e);
        } catch (EmptyElemExctption e) {
            System.out.println(e);
        } catch (CantFinfFileException e) {
            System.out.println(e);
        }

    }

    public static void zeroDiv() {
        try {
            int a = 15;
            int res = a / 0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            throw new ZeroDivException("Делить на ноль нельзя!");
        }
    }

    public static void nullElem1() {
        Integer[] arr = { 1, 7, 5, null, 3 };
        int a = 2;
        if (arr[a] == null)
            throw new EmptyElemExctption("Элемент null!");
        System.out.println("Элемент на позиции " + a + " -> " + arr[a]);
    }

    public static void nullElem2() {
        Integer[] arr = { 1, 7, 5, null, 3 };
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                arr[i]++;
            }
        } catch (NullPointerException e) {
            throw new EmptyElemExctption("Элемент null");
        }
    }

    public static void fileReader() throws CantFinfFileException {
        try (FileReader fr = new FileReader("C\\hiygv\\hhh")) {
            fr.read();
        } catch (FileNotFoundException e) {
            throw new CantFinfFileException("файл не найден");
        } catch (IOException e) {
            System.out.println("___");
        }
    }
}
