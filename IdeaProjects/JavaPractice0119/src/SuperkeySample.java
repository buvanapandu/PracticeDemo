public class SuperkeySample {
    int speedlimit = 50;
}
class Childclass extends SuperkeySample {
    int speedlimit = 100;

    void disp() {
        System.out.println(speedlimit);
        System.out.println(super.speedlimit);
    }
public static void main(String[] args) {
        Childclass sp = new Childclass();
        sp.disp();
    }
}
