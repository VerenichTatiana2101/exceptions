package lesson001;

public class Task02 {
    /*
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и
     * некоторое значение.
     * Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
     * например:
     * если длина массива меньше некоторого заданного минимума, метод возвращает -1,
     * в качестве кода ошибки.
     * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
     * если вместо массива пришел null, метод вернет -3
     * придумайте свои варианты исключительных ситуаций и верните соответствующие
     * коды ошибок.
     * Напишите метод, в котором реализуйте взаимодействие с пользователем.
     * То есть, этот метод запросит искомое число у пользователя, вызовет первый,
     * обработает возвращенное значение и покажет читаемый результат пользователю.
     * Например, если вернулся -2, пользователю выведется сообщение: “Искомый
     * элемент не найден”.
     */
    public static void main(String[] args) {
        int[] array = { 15, 10, 1, 3, 2 };
        // int[] array = null;
        codeInfo(size1(array, 15, 3));
    }

    public static int size1(int[] arr, int arg, int min) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arg) {
                return i;
            }
        }
        return -2;
    }

    public static void codeInfo(int res) {
        if (res == -1) {
            System.out.println("Длина массива меньше заданного минимума");
            return;
        }
        if (res == -2) {
            System.out.println("Искомый элемент не найден");
            return;
        }
        if (res == -3) {
            System.out.println("вместо массива пришел null");
            return;
        }
        System.out.println("Индекс искомого элемента: " + res);
    }
}