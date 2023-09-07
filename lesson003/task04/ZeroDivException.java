package lesson003.task04;

public class ZeroDivException extends ArithmeticException {
    String s;

    public ZeroDivException(String s) {
        super(s);
    }

    // @Override
    // public String getMessage() {
    //     return s = ("Делить на ноль нельзя!");
    // }
}
