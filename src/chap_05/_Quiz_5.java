package chap_05;

public class _Quiz_5 {
    public static void main(String[] args) {
        int[] size = new int[10];
        size[0] = 250;
        for (int i = 0; i < size.length; i++) {

            if (i != 0)
                size[i] = size[i - 1] + 5;

            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }

    }
}
