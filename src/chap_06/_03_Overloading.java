package chap_06;

public class _03_Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        // 메서드 오버로딩은 같은 이름의 메서드를 여러 번 선언 가능하게 한다.
        // 1. 인수의 타입이 다르거나
        // 2. 인수의 개수가 달라야 한다.
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));
    }
}
