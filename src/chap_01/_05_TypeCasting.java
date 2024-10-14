package chap_01;

public class _05_TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting
        //정수형에서 실수형으로, 또는 실수형에서 정수형으로

        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        float score_f = 93.3f;
        double score_d = 93.3;

        System.out.println((int)score_f);
        System.out.println((int)score_d);

        //정수+실수 연산
        score = 93 + (int)score_f;
        System.out.println(score);

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble);

        int convertedScoreInt = (int)score_d;
        System.out.println(convertedScoreInt);

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}
