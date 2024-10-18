package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // private: 해당 클래스 내에서만 접근 가능
        // public: 모든 클래스에서 접근 가능
        // default: 아무것도 적지 않았을 때 - 같은 패키지 내에서만 접근 가능
        // protected: 같은 패키지 내에서 접근 가능, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackboxRefurbish b1 = new BlackboxRefurbish();
        b1.modelName = "Blacky";
        b1.resolution = "FHD";
        b1.color = "black";
        b1.setPrice(-5000);

        BlackboxRefurbish b2 = new BlackboxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
