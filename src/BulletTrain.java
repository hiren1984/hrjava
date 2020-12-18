public class BulletTrain extends Train {
    String Luxery;

    public String getLuxery() {
        return Luxery;
    }

    public void setLuxery(String luxery) {
        Luxery = luxery;
    }

    //@Override
    void display() {
        System.out.println("Luxery");
        super.display();
    }

    public static void main(String[] args) {
        BulletTrain bt= new BulletTrain();
        bt.setSpeed("200 mph");
        bt.setLuxery("Very much comfortable ride");
        System.out.println("This Train is running on  "+bt.getSpeed());
        System.out.println("This Train Provides "+bt.getLuxery());
    }
}
