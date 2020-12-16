public class Addition2 {
    static int add (int a ,int b){return a+b;}
    static double add (double a, double b){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args) {
        System.out.println(Addition2.add(10,10));
        System.out.println(Addition2.add(15.4,12.8));
    }

}
