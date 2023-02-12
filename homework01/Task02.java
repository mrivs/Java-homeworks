//Вывести все простые числа от 1 до 1000

public class Task02 {
    public static void main(String[] args) {

        for (int index = 1; index <= 1000; index++) {
            if (isSimple(index)) {
                System.out.print(index);
                System.out.print(" ");
            }
        }
    }

    public static boolean isSimple(int n) {

        for (int index = 2; index < n; index++) {
            if (n % index == 0)
                return false;
        }
        return true;
    }
}
