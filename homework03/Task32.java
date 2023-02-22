//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package homework03;

import java.util.ArrayList;
import java.util.Random;

public class Task32 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(0, 11));
        }
        System.out.println(arr);
        arr.removeIf(n -> (n % 2 == 0));
        System.out.println(arr);
    }
}
