import jdk.jfr.Description;

public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;

    public MarsRobot(String status, int speed, float temperature) {
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }

    public MarsRobot() {

    }

    void showAttribiutes() {
        System.out.println("Status: "+status);
        System.out.println("Predkosc: "+speed);
        System.out.println("Temperatura: "+temperature);
    }

    @Override
    public void checkTemprature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }


    @Override
    public void checkStatus() {
        System.out.println("Status: "+status);
    }
}
