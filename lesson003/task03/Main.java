package lesson003.task03;

public class Main {
    public static void main(String[] args) {
        /*
         * Задание №2
         * Создайте класс Счетчик, у которого есть метод add(),
         * увеличивающий значение внутренней int переменной на 1.
         * Сделайте так, чтобы с объектом такого типа можно было работать в блоке
         * try-with-resources.
         * Нужно бросить исключение,
         * если работа с объектом типа счетчик была не в ресурсном try
         * и/или ресурс остался открыт.
         * Подумайте какой тип исключения подойдет лучше всего.
         */
        try (Counter count = new Counter()) {
            count.add();
            //count.close();
            count.printCount();
            System.out.println(count.isOpen());
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
