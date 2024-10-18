package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_Polymorphism {
    public static void main(String[] args) {
        //다형성

        //class Person
        //class Student extends Person
        //class Teacher extends Person

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            System.out.println(cam.name);
        }

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
    }
}
