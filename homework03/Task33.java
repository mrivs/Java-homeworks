
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package homework03;

import java.util.ArrayList;
import java.util.Random;

public class Task33 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(1, 11));
        }
        System.out.println(arr);
        System.out.printf("max: %3d \n",getmax(arr));
        System.out.printf("min: %3d \n",getmin(arr));
        System.out.printf("arithmetic mean: %.2f \n",getam(arr));
    }

    public static int getmax(ArrayList<Integer> arr){
        int max=arr.get(0);
        for (Integer i : arr) {
            if (i>max) max=i;
        }
        return max;
    }
    public static int getmin(ArrayList<Integer> arr){
        int min=arr.get(0);
        for (Integer i : arr) {
            if (i<min) min=i;
        }
        return min;
    }
    public static double getam(ArrayList<Integer> arr){
        double sr=0;
        for (int i : arr) {
            sr=sr+i;
        }
        
        return sr/arr.size();
    }
}
