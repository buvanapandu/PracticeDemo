package MainmethodOverloading;

public class MainOver {
    public static void main(String[] args) {
        System.out.println("Main method is running");
        B.main(args);
        main("Hello");
        main(5);
        main(68,20);
    }

    public static void main(String arg){
        System.out.println("String only printing");
    }

    public static void main(int a){
        System.out.println("Integer args is printing");
    }

    public static void main(int a, int b){
        System.out.println("Integer 2nd arg is printing");
    }
}
