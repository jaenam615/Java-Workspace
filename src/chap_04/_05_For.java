package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문

        for (int i = 0; i < 10; i++) {
            System.out.println("환영합니다. Java입니다.");
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.println("환영합니다. 짝수입니다." + i);
        }

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
    }
}
