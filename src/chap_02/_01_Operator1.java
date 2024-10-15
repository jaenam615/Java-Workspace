package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(4 % 2); //0

        //사칙연산의 순서는 수학과 같다
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2); //8

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(++val);

    }
}
