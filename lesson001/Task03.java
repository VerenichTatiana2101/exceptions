package lesson001;

public class Task03 {
    /*
     * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный
     * массив.
     * Необходимо посчитать и вернуть сумму элементов этого массива.
     * При этом накладываем на метод 2 ограничения:
     * метод может работать только с квадратными массивами (кол-во строк = кол-ву
     * столбцов),
     * и в каждой ячейке может лежать только значение 0 или 1.
     * Если нарушается одно из условий, метод должен бросить RuntimeException с
     * сообщением об ошибке.
     */
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 1, 1 } };
        System.out.println(sumMass(arr));
    }

    public static int sumMass(int[][] array) {
        if (array.length != array[1].length) {
            throw new RuntimeException("массив не соответствует: "
                    + array[0].length
                    + "x" + array[1].length);
        }
        int res = 0;
        for (int[] isArr : array) {  //лучше через фор
            for (int elem : isArr) {
                if (elem != 0 && elem != 1) {
                    throw new RuntimeException("массив не соответствует, элемент не равен 0 или 1");
                }
                res += elem;
            }
        }
        return res;
    }
}
