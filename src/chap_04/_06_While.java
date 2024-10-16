package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 while
        int distance = 25;
        int travel = 0;
        while (travel < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리는 " + travel + "입니다.");
            travel += 3;
        }
        System.out.println("현재 이동 거리는 25입니다.");
        System.out.println("도착하였습니다.");
    }
}
