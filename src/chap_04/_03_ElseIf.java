package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        boolean isHanlabong = true;
        boolean isMango = true;

        if (isHanlabong) {
            System.out.println("한라봉 에이드 + 1");
        } else if (isMango) {
            System.out.println("망고주스 + 1");
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("음료 주문 완료.");
    }
}
