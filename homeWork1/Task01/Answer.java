package homeWork1.Task01;

public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = { 1, 3, 5, 7, 15 };
        int a = 10;
        if (array.length < a) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < array.length; i++) {
            if(a == array[i]){
                System.out.println("Элемент массива " + a + " под индексом: " + i);
            }
        }
    }

    public static void divisionByZero() {
        int a = 5;
        int b = 0;
        int c = a / b;
        if (c == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a + "/" + b + "=" + c);
    }

    public static void numberFormatException() {
        String id = "123a";
        if(id.matches("\\d+")) 
            System.out.println("Строку " + id + " можно преобразовать в число");
        else
            throw new NumberFormatException();
    }
}
