package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;

        switch (ranking) {
            case 1:
                System.out.println("전액 장학금입니다.");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금입니다.");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("조회 완료");

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금입니다.");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금입니다.");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("조회 완료");


        int grade = 1;
        int price = 7000;

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
    }
}
