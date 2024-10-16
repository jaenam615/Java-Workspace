package chap_06;

public class _Quiz_06 {
    public static String mask(String value) {
        String result = "";
        if (value.length() <= 4) {
            result = "";
            char firstLetter = value.charAt(0);
            result = result.concat(String.valueOf(firstLetter));
            for (int i = 1; i < value.length(); i++) {
                result = result.concat("*");
            }
        } else if (value.length() == 14) {
            result = value.substring(0, 9);
            result = result.concat("******");
        } else {
            result = value.substring(0, 10);
            result = result.concat("****");
        }
        return result;
    }

    public static void main(String[] args) {
        class self {
            static final String name = "홍길동";
            static final String id = "990101-1234567";
            static final String phone = "010-1234-5678";
        }

        System.out.println(mask(self.name));
        System.out.println(mask(self.id));
        System.out.println(mask(self.phone));

    }
}
