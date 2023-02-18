// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package homework02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task21 {
    private static String readerFile(String pathFile) throws FileNotFoundException, IOException {

        String str = "empty";
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            StringBuilder sb = new StringBuilder();
            str = br.readLine();
        }
        return str;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str = readerFile("homework02/task21.txt");
        boolean ft = true;
        str = str.replaceAll("[{} ]", "");
        String[] arr = str.split("[:,]");
        System.out.println(arr.length);
        StringBuilder sb = new StringBuilder("SELECT * FROM students WHERE ");
        for (int i = 0; i < arr.length; i += 2) {
            if (!arr[i + 1].equals("\"null\"")) {
                if (!ft)
                    sb.append(" AND ");
                ft = false;
                sb.append(arr[i].substring(1, arr[i].length() - 1));
                sb.append(" = ");
                sb.append(arr[i + 1]);
            }
        }
        sb.append(";");
        System.out.println(sb);
    }

}