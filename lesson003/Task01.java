package lesson003;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task01 {
    public static void main(String[] args) {
        /*
         * Перепишите следующийкод, используяресурсный try
         * 
         */
    }

    // public static void rwLine(Path pathRead, Path pathWrite) throws IOException{
    // BufferedReader in = null;
    // BufferedWriter out = null;
    // try {
    // in = Files.newBufferedReader(pathRead);
    // out = Files.newBufferedWriter(pathWrite);
    // out.write(in.readLine());
    // } finally {
    // try{
    // if(in!= null) in.close();
    // } catch(IOException e);
    // try {
    // if(out != null) out.close();
    // } catch (IOException e) {
    // }
    // }
    // }

    public static void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
                BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        } catch (IOException e) {

        }

    }
}
