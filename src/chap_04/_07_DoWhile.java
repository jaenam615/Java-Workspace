package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int travel = 0;
        int height = 2;
        while (travel + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리는 " + travel + "입니다.");
            travel += 3;
        }
        System.out.println("도착했습니다.");

        // 반복문 Do While
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + travel);
            travel += 3;
        } while (travel + height < distance);
        System.out.println("도착했습니다.");
    }
}
