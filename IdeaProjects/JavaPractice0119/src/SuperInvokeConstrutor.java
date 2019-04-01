public class SuperInvokeConstrutor {
    SuperInvokeConstrutor(){
        System.out.println("Parent Contructor is created");
    }
}
class Bike extends SuperInvokeConstrutor{
    Bike(){
        super();
        System.out.println("Child Class constructor is created");
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
    }
}
