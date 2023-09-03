package lesson002;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Task04 {
    public static void main(String[] args) {
        /*
         * Исправить код, применить подходящие способы обработки исключений.
         */
        InputStream inputStream;
        try {
            String[] strings = { "asdf", "asdf" };
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");

        } catch (StackOverflowError error) {
            System.out.println("asdfasdfdsa");
        } catch (Throwable e) {   //поставили после стековерфлов, т.к этот выше
            e.printStackTrace();
        } finally {
            System.out.println("я всё равно выполнился");
        }
        System.out.println(" я жив! ");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }

}
