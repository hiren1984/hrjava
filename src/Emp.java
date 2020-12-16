public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id,String name,Address address) {
        this.id = id;
        this.name =name;
        this.address = address;
    }


    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.street1+" "+address.street2+" "+address.city);

    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet1("TestStreet");
        address.setStreet2("TestSubStreet");
        address.setCity("TestTown");
        Address address1= new Address();
        address1.setStreet1("MyStreet");
        address1.setStreet2("MySubStreet");
        address1.setCity("MyTown");

        Emp e1=new Emp(5000,"JOHN",address);
        Emp e2=new Emp(5001,"MIKE",address1);
        e1.display();
        e2.display();

    }
}
