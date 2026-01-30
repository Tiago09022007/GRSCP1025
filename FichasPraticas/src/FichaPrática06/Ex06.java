package FichaPrática06;

public class Ex06 {

    public static boolean numeroPar(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numeroPositivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numeroPrimo(int num) {

        for (int divisor = 2; divisor < num; divisor++) {

            if (num % divisor == 0) {
                return false;
            }
        }

        return true;

    }
}






