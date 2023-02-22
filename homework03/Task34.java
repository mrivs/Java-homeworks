// 4*. (Необязательная задача повышенной сложности)
// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой

package homework03;

import java.util.ArrayList;
import java.util.Random;

public class Task34 {
    public static void main(String[] args) {
        ArrayList<Integer> co1 = new ArrayList<>();
        ArrayList<Integer> co2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            co1.add(rnd.nextInt(1, 11));
            co2.add(rnd.nextInt(1, 11));
        }
    }

}
