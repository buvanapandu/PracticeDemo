public class SuperInvokeSample {
    void message(){
        System.out.println("Welcome");
    }
}
class Childc1 extends SuperInvokeSample{
    void display(){
        message();
    }

    public static void main(String[] args) {
        Childc1 c1 = new Childc1();
        c1.display();
    }
}
