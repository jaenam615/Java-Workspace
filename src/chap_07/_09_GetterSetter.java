package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "Blacky";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        b1.price = b1.price - 5000;

        Blackbox b2 = new Blackbox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
