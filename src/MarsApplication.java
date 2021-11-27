public class MarsApplication {
    public static void main(String[] args) {
/*        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribiutes();
        System.out.println("Zwiększenie prędkości do 3");
        spirit.speed =3;
        spirit.showAttribiutes();
        System.out.println();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature =-90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttribiutes();*/

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "ekploracja";
        opportunity.speed = 23;
        opportunity.temperature = 40;
        opportunity.showAttribiutes();

        System.out.println();
        opportunity.status = "Lądowanie";
        opportunity.checkStatus();

    }
}
