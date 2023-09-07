package lesson003.task03;

public class Counter implements AutoCloseable {
    private static int count;
    private static boolean isOpen = false;

    public Counter() {
        isOpen = true;
    }

    public void add() {
        if(!isOpen) throw new RuntimeException("экземпляр закрыт, обратиться к нему нельзя");
        count++;
    }

    public void printCount() {
        if(!isOpen) throw new RuntimeException("экземпляр закрыт, обратиться к нему нельзя");
        System.out.println("count = " + count);

    }

    @Override
    public void close() throws Exception {
        isOpen = false;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public static void setOpen(boolean isOpen) {
        Counter.isOpen = isOpen;
    }

}
