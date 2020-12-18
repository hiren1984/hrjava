public class Train {
    String Speed;
    String Engine;

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String speed) {
        Speed = speed;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }
    void display(){
        System.out.println(Speed+" "+Engine);
    }

    public static void main(String[] args) {
        Train t= new Train();
        t.setSpeed("120 mph");
        t.setEngine("Regular Engine");
        System.out.println("This Train is running on  "+t.getSpeed());
        System.out.println("This Train has   "+t.getEngine());
    }
}
