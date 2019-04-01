public class StaticSample {
    String name;
    int rollNo;
    static String college = "ERC";

    public StaticSample(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void disp(){
        System.out.println(name + " " + rollNo + " " + college);
    }
    public static void main(String[] args) {
        StaticSample sample1 = new StaticSample("AAAAA", 001);
        sample1.disp();
        college = "SRC";
        StaticSample sample2 = new StaticSample("BBBBB", 002);
        sample2.disp();
    }

}
