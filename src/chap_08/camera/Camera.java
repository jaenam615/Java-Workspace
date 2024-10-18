package chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("taking a pic");
    }

    public void recordVideo() {
        System.out.println("recording a vid");
    }

    public abstract void showMainFeature();
}
