package lesson002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task03 {
    /*
     * Запишите в файл следующие строки:
     * Анна = 4;
     * Елена = 5;
     * Марина = 6;
     * Владимир = ?;
     * Константин = ?;
     * Иван = 4;
     * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
     * массив
     * (либо HashMap). В отдельном методе нужно будет пройти по структуре данных,
     * если сохранено значение ?, заменить его на соответствующее число.
     * Если на каком-то месте встречается символ, отличный от числа или ?,
     * бросить подходящее исключение. Записать в тот же файл данные с изменёнными
     * символами.
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Desktop\\Exceptions\\lesson002\\task03.txt";
        writeFile(changeLetter(readFile(path)), path);
    }

    public static List<String[]> readFile(String path) {
        List<String[]> result = new ArrayList<String[]>();
        try(BufferedReader file = new BufferedReader(new FileReader(path));) {
             // чтение файла
            String line = "";
            while ((line = file.readLine()) != null) {
                String[] temp = line.split("=");
                if (!temp[1].equals("?") && !isNumeric(temp[1])) {
                    throw new RuntimeException("Некорректные данные в строке " + line);
                }
                result.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static List<String[]> changeLetter(List<String[]> data) {
        for (String[] line : data) {
            if (line[1].equals("?")) {
                line[1] = String.valueOf(line[0].length()); // приводит в число, считает неправильно, почему??
            }
        }
        return data;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeFile(List<String[]> data, String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
          for (String[] strings : data) {
            bw.write(strings[0] + "=" + strings[1]);
            bw.newLine();
          }
          System.out.println("успешно");
          bw.close();
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
      }
    }
