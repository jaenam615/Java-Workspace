package chap_06;

public class _02_Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static int powerByExp(int number, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        power(3);

        int expNum = powerByExp(3, 3);
        System.out.println(expNum);
    }
}
