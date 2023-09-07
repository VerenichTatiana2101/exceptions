package homeWork3.fileWorker;

import java.io.FileWriter;

import homeWork3.model.Person;

public class AddToFile {


    public static void addToFile(Person person) {
        try {
          FileWriter writer = new FileWriter(person.getLastName(), true);
          writer.write(person.toString() + "\n");
          writer.close();
        } catch (Exception e) {
          System.out.println("Проблемы с файлом" + e.getMessage());
        }
      }
}
