package homework05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class Task52 {
    public static void main(String[] args) {

        List<String> names = List.of("Иван", "Мария", "Петр", "Антон", "Иван", "Мария", "Иван", "Петр", "Иван",
                "Мария");

        List<Object[]> countNames = new ArrayList<>();
        Map<String, Integer> emp = new HashMap<>();
        int temp = 0;
        for (String name : names) {
            if (emp.containsKey(name)) {
                temp = emp.get(name);
                temp++;
                emp.put(name, temp);
            } else
                emp.put(name, 1);
        }

        for (Map.Entry<String, Integer> entry : emp.entrySet()) {
            countNames.add(new Object[] { entry.getKey(), entry.getValue() });
        }

        countNames.sort((Object[] o1, Object[] o2) -> {
            if ((int) o1[1] < (int) o2[1])
                return 1;
            else
                return -1;
        });

        
        for (Object[] object : countNames) {
            System.out.println(String.format("%s, %d", object[0], object[1]));
        }
    }
}
