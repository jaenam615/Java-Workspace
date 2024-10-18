package chap_07.camera;

public class SpeedCam extends Camera {
    public SpeedCam() {
//        this.name = "과속단속카메라";
        super("과속단속카메라");
    }

    public void takePicture() {
        //사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        //속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        //번호판 인식
        System.out.println("차량 번호를 인식합니다.");
    }
}
