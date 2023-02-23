package homework04;

import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class Task41 {
    public static void main(String[] args) {

        LinkedList <Object>ll=new LinkedList<Object>();
        Random rnd = new Random();

        ll.add("begin");
        for (int i = 0; i < 10; i++) {
            ll.add(rnd.nextInt(0, 11));
        }
        ll.add("end");
        System.out.println(ll);
        System.out.println(getreverseLL(ll));
        System.out.println(ll);
    }

    public static LinkedList<Object> reverseLL(LinkedList<Object> ll) // возвращает “перевернутый” входящий список 
    {
        for (int i = 0; i < ll.size() / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(ll.size() - i - 1));
            ll.set(ll.size() - i - 1, temp);
        }
 
        return ll;
    }
    public static LinkedList<Object> getreverseLL(LinkedList<Object> ll) // возвращает новый “перевернутый” список не  меняя входящий
    {
        LinkedList<Object> rl = new LinkedList<Object>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            rl.add(ll.get(i));
        }
        return rl;
    }
}
