package homeWork3.view;

import homeWork3.exceptions.BirthDayException;
import homeWork3.fileWorker.AddToFile;
import homeWork3.model.Person;

public class Main {
    public static void main(String[] args) throws BirthDayException {
        Person person = new ViewNoteData().addPerson();
        System.out.println(person);
        AddToFile.addToFile(person);
    }
}
