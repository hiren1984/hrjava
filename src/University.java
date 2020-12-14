public class University {
    int rollno;
    String name;
    String add;
    String city;

    static String university = "NYU";

    /*public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }*/

    public University(int rollno, String name, String add, String city,String University) {
        this.rollno = rollno;
        this.name = name;
        this.add = add;
        this.city = city;
    }

    void display()
        {System.out.println(rollno + " |" + name + " | " + add + " |" + city + " | " + university);
    }

    @Override
    public String toString() {
        return "University{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    public static void main(String[] args) {
        University u1 = new University(102,"Aarav","newjersey","newyork",university);
        University u2 = new University(103,"johnmichael","texasstreet","texas",university);
        University u3 = new University(104,"blue","newengland","newengland",university);
        u1.display();
        u2.display();
        u3.display();



    }


}