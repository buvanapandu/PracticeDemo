package ControlFlow;

public class Sample1 {
    int a=10;
    int b=34;
    String s1 = "Welcome";
    String firstName = "Hello";
    String lastName =" World";

    void disp() {
        int l = s1.length();
        System.out.println(l);
        s1 = s1.toUpperCase();
        System.out.println("Uppercase : " + s1);
        s1 = s1.toLowerCase();
        System.out.println("LowerCase : " + s1);
    }
    void run() {
        int c = a + b;
        System.out.println(c);
    }
    void disp1(){
        String x = firstName.concat(lastName);
        System.out.println(x);
    }
    void cal(){
        /*Calculation*/
        double current =17;
        double rate = 1.5;
        double future = current*rate;
        System.out.println(future);

        /*casting to double*/
        double accurate = (double)a / b;
        System.out.println(accurate);
    }
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        System.out.println("Welcome");
        //System.out.println(c);
          s.run();
          s.disp();
          s.disp1();
          s.cal();
    }
}
