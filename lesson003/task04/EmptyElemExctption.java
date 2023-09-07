package lesson003.task04;

public class EmptyElemExctption extends NullPointerException{
    String msg;

    public EmptyElemExctption(String msg) {
        super(msg);
    }

    // @Override
    // public String getMessage() {
    //     return msg = "элемент null";
    // }
    
}
