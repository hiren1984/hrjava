public class Dog2 extends Animal2 {
    String color="grey";
    void printcolor(){
        System.out.println(color);//print color of Dog2/child class.
        System.out.println(super.color);//print color of animal/parent class.
    }

    public static void main(String[] args) {
        Dog2 d=new Dog2();
        d.printcolor();
    }
}
