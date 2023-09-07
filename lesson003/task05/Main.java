package lesson003.task05;

public class Main {
    public static void main(String[] args) {
        /*
         * Задание №4
         * 1. Напишите метод,на вход которого подаётся двумерный строковый массив
         * размером 4х4. При подаче массива другого размера необходимо бросить
         * исключение MyArraySizeException.
         * 2. Далее метод должен пройтись по всем элементам массива,преобразовать в
         * int и просуммировать. Если в каком-то элементе массива преобразование
         * не удалось (например, в ячейке лежит символ или текст вместо числа),
         * должно быть брошено исключение MyArrayDataException с детализацией, в
         * какой именно ячейке лежат неверные данные.
         * 3. В методе main() вызвать полученный метод, обработать возможные
         * исключения MyArraySizeException и MyArrayDataException и вывести
         * результат расчета (сумму элементов,при условии что подали на вход
         * корректный массив).
         */
        String[][] arg = { { "1", "2", "7", null }, { "2", "3", "4", "7" }, { "2", "3", "4", "7" },
                { "2", "3", "4", "7" } };
        try {
            System.out.println(sumEl(arg));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e);
        }
    }

    public static int sumEl(String[][] arr) {
        if (arr.length != arr[0].length || arr.length != 4) {
            throw new MyArraySizeException(
                    "массив не соответствует 4 x 4. размер " + arr.length + " x " + arr[0].length);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "ошибка преобразования строки в число, строка " + i + " индекс " + j);
                }
            }
        }
        return sum;
    }
}
