public class Finalkeyword {
    String name;
    int rollNo;
    final String college = "ERC";

    public Finalkeyword(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void disp(){
        System.out.println(name + " " + rollNo + " " + college);
    }
    public static void main(String[] args) {
        Finalkeyword f1 = new Finalkeyword("AAAAA", 001);
        Finalkeyword f2 = new Finalkeyword("BBBBB", 002);
        f1.disp();
        f2.disp();
    }
}
