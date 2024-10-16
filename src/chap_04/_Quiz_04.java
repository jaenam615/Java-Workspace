package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int rate = 4000;
        int hours = 5;
        int max = 30000;
        boolean isDiscount = true;
        int fee = 0;

        for (int i = 0; i < hours; i++) {
            fee += rate;
            if (fee == max) break;
        }
        if (isDiscount) fee /= 2;
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
