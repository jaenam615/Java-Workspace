package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();

        b1.autoReport();

        System.out.println("지원 이후");
        Blackbox.canAutoReport = true;

        b1.autoReport();

        b1.insertMemoryCard(20);


        //일반 영상 : 1

        //이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1);

        System.out.println("일반 영상 파일 수: " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수: " + fileCount + '개');
    }
}
