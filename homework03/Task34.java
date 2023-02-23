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
        for (int i = 0; i < 20; i++) {
            co1.add(rnd.nextInt(0, 7));
            co2.add(rnd.nextInt(3, 11));
        }
        System.out.println(co1);
        System.out.println(co2);
        System.out.println(diff(co1,co2));
        System.out.println(diff(co2,co1));
        System.out.println(simdiff(co1,co2));
    }

    public static ArrayList<Integer> diff( ArrayList<Integer> co1, ArrayList<Integer> co2 ) {
        ArrayList<Integer> res  = new ArrayList<Integer>(co1.size());
        for (int item : co1) res.add(item);
        res.removeAll(co2);
        return res;
    }

    public static ArrayList<Integer> simdiff( ArrayList<Integer> co1, ArrayList<Integer> co2 ) {
        ArrayList<Integer> res  = new ArrayList<Integer>(diff(co1,co2).size()+diff(co2,co1).size());
        res.addAll(diff(co1,co2));
        res.addAll(diff(co2,co1));
        return res;

    }


}
