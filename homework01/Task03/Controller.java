package Task03;

import java.util.Scanner;

public class Controller {

    public static void start() {
        int sign = 0;
        double firstval = 0;
        double secval = 0;
        double res = 0;

        System.out.print("Введите 1 число: ");
        Scanner iScanner = new Scanner(System.in);
        firstval = iScanner.nextDouble();
        System.out.print("Выберете действие\n 1: + \n 2: -\n 3: *\n 4: / \n 5: %\n ");
        sign = iScanner.nextInt();
        System.out.print("Введите 2 число: ");
        secval = iScanner.nextDouble();
        switch (sign) {
            case 1:
                res = Modul.summ(firstval, secval);
                break;
            case 2:
                res = Modul.diff(firstval, secval);
                break;
            case 3:
                res = Modul.mult(firstval, secval);
                break;
            case 4:
                res = Modul.div(firstval, secval);
                break;
            case 5:
                res = Modul.div_ost(firstval, secval);
                break;
            case 6:
                return;
            default:
                break;

        }
        System.out.print("результат: ");
        System.out.print(res);
        iScanner.close();
    }

}
