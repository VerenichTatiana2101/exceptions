package homeWork1.Task03;

public class Answer {
    /*
     * Реализуйте метод divArrays,
     * принимающий в качестве аргументов два целочисленных массива a и b,
     * и возвращающий новый массив с, каждый элемент которого равен
     * частному элементов двух входящих массивов в той же ячейке.
     * Если длины массивов не равны - верните нулевой массив длины 1.
     * Важно: При выполнении метода единственное исключение,
     * которое пользователь может увидеть - RuntimeException, т.е. ваше.
     * Напишите свой код в методе divArrays класса Answer.
     * Метод divArrays принимает на вход два параметра:
     * int[] a - первый массив
     * int[] b - второй массив
     */
    public int[] divArrays(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return new int[1];
        }
        // for (int i : b) {
        // if (i == 0) {
        // throw new RuntimeException("В массиве делителей присутствуют нули");
        // }
        // }
        // int[] c = new int[a.length];
        // for (int i = 0; i < a.length; i++) {
        // c[i] = a[i] / b[i];
        // }
        // return c;
        // }
        else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0)
                    throw new RuntimeException("Division by 0");
                else
                    c[i] = a[i] / b[i];
            }
            return c;
        }
    }
}
