package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String social = "901231-1234567";

        System.out.println(social.substring(0, 8));
        System.out.println(social.substring(0, social.indexOf("-") + 2));
    }
}
