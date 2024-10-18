package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 (범위): " + random.nextInt(10));
        System.out.println("랜덤 실수 : " + random.nextDouble());
//        System.out.println("랜덤 실수 (범위): " + random.nextDouble());
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));
        System.out.println("랜덤 boolean : " + random.nextBoolean());
    }
}
