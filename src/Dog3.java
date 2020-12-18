public class Dog3 extends Animal3 {
    void eat() {
        System.out.println("eating bone");
    }

    void bark() {
        System.out.println("barking when see stranger");
    }

    void Test() {
        super.eat();
        bark();
    }

    public static void main(String[] args) {
        Dog3 d3 = new Dog3();
        d3.Test();
    }
}
