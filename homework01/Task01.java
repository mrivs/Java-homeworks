/**
 * task01
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task01 {
    public static void main(String[] args) {
        int N=4;
        System.out.println(summN(N));
        System.out.println(factorial(N));
    }
    public static int factorial (int n) {
        if (n<=1)return 1;
        else return n*factorial(n-1);
    }

    public static int summN (int n) {
        if (n==1)return 1;
        else return n+summN(n-1);
    }

}
