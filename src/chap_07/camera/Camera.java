package chap_07.camera;

public class Camera {
    public String name;

    public Camera() {
        this("카메라");
    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        //사진 촬영
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        //동영상 녹화
        System.out.println("동영상을 촬영합니다.");
    }
}
