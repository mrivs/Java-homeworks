// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package homework02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task22 {

    private static Logger lg = Logger.getLogger(Task22.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {

        FileHandler fh = new FileHandler("homework02/task22log.txt");
        lg.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = new int[] { 2, 9, 3, 4, 6, 7, 1, 5, 10, 8 };
        bubsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubsort(int[] arr) {
        int temp;
        boolean sorted = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                    lg.info(Arrays.toString(arr));
                }
            }
            if (sorted == true)
                return;
            else
                sorted = true;
        }
    }
}
