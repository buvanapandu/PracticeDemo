public class Superthreesample{
    void message(){
        System.out.println("Welcome");
    }
}
class Students extends Superthreesample{
    void message(){
        System.out.println("Hello World!");
    }

    void display(){
        message();
        super.message();
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.display();
    }
}

