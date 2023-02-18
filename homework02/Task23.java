
// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package homework02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str = readerFile("homework02/task23.txt");
        String[] arr = convert(str);
        for (String s : arr) {
            System.out.println(s);
        }

    }

    private static String[] convert(String str) {
        str = str.substring(2, str.length() - 1);
        str = str.replaceAll("\"", "");
        str = str.replaceAll("\\}", ".");
        str = str.replaceAll("[,:]", " ");
        str = str.replaceAll("фамилия", "Студент");
        str = str.replaceAll("оценка", "получил");
        str = str.replaceAll("предмет", "по предмету");
        String[] arr = str.split("\\{");
        return arr;
    }

    private static String readerFile(String pathFile) throws FileNotFoundException, IOException {

        String str = "empty";
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            StringBuilder sb = new StringBuilder();
            str = br.readLine();
        }
        return str;
    }

}
