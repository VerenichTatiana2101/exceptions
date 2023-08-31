package homeWork1.Task02;

public class Answer {
    /*
     * Реализуйте метод subArrays, принимающий в качестве аргументов два
     * целочисленных массива a и b,
     * и возвращающий новый массив c, каждый элемент которого
     * равен разности элементов двух входящих массивов в той же ячейке.
     * Если длины массивов не равны - верните нулевой массив длины 1.
     * Напишите свой код в методе subArrays класса Answer.
     * Метод subArrays принимает на вход два параметра:
     * int[] a - первый массив
     * int[] b - второй массив
     */
    public int[] subArrays(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return new int[1];
        } else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
    }
}
