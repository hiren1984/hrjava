import javax.print.attribute.standard.PresentationDirection;

public class SpeedBoat {
      int  speed;
    String color;
    String motor;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public SpeedBoat(int speed, String color, String motor) {
        this.speed = speed;
        this.color = color;
        this.motor = motor;
    }

    public static void main(String[] args) {
        //SpeedBoat Boat = new SpeedBoat();
        //SpeedBoat.setspeed("90");
        //SpeedBoat.setcolor("white");
        //SpeedBoat.setmotor("Heavy");
        SpeedBoat B=new SpeedBoat(90,"red","heavy");

        System.out.println(B.getColor());
        System.out.println(B.getSpeed());
        System.out.println(B.getMotor());


    }

}
