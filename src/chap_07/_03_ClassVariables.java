package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";
        Blackbox b2 = new Blackbox();
        b2.modelName = "하양이";

        // 자동 신고 기능 개발 여부
        System.out.println("--before--");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport);
        System.out.println("블랙박스 제품 자동 신고 기능: " + Blackbox.canAutoReport);

        // 기능 개발
        Blackbox.canAutoReport = true;
        System.out.println("--after--");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport);
        System.out.println("블랙박스 제품 자동 신고 기능: " + Blackbox.canAutoReport);
    }
}
