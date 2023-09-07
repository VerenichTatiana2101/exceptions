package lesson003;

public class Task02 {
    public static void main(String[] args) {
        /*
         * Задание №1
        * Создайте метод doSomething(), который может быть источником одного из
        * типов checked exceptions (тело самого метода прописывать не обязательно).
        * Вызовите этот метод из main и обработайте в нем исключение, которое
        * вызвал метод doSomething().
         */
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("catch some exception");
        }
    }

    public static void doSomething() throws Exception{
        //throw new Exception("your exception"); не нужно
    } 
}
