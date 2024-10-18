package chap_07.burger;

public class _Quiz_07 {
    public static void main(String[] args) {
        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0] = new Hamburger();
        hamburgers[1] = new Cheeseburger();
        hamburgers[2] = new Shrimpburger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------------------");
        for (Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("--------------------");
        }

        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
