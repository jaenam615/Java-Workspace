package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "재희";

        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "남재희";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;

        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14154933333; // 보다 정밀한 소숫점 계산에 활용
        float f = 3.141549333333F;

        System.out.println(d);
        System.out.println(f);

        long l = 1_000_000_000_000L;

        System.out.println(l);
    }
}
