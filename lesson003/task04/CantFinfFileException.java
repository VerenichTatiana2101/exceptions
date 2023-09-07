package lesson003.task04;

import java.io.FileNotFoundException;

public class CantFinfFileException extends FileNotFoundException {

    public CantFinfFileException(String s) {
        super(s);
    }
    
}
