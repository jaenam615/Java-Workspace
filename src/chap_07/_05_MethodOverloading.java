package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";

        b1.record(false, false, 10);
        b1.record(true, false, 3);
        System.out.println("---------------------------");
        b1.record();
    }
}
