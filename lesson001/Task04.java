package lesson001;

public class Task04 {
    public static void main(String[] args) {
        /*
         * Реализуйте метод checkArray(Integer[] arr),
         * принимающий в качестве аргумента целочисленный одномерный массив.
         * Метод должен пройтись по каждому элементу и проверить что он не равен null.
         * А теперь реализуйте следующую логику:
         * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
         * пользователя
         * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
         * “подсветить”
         */
        Integer[] array = { 1, 3, null, 15, 24, null, 6, 0, 0 };
        checkArray(array);
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder nullElements = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullElements.append(i).append("; ");
            }
        }
        if (nullElements.length() > 0) {
            throw new RuntimeException("В массиве имеются пустые элементы, индекс: " + nullElements);
        }
    }
}
