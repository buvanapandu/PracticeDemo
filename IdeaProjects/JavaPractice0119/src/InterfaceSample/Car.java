package InterfaceSample;

public interface Car {
    static double loanInterest = 0.5;
    final int rate=4;
    int no = 001;

    void start();
    void stop();
    void refuel();
}

class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW start");
    }
    public void stop(){
        System.out.println("BMW stops");
    }
    public void refuel(){
        System.out.println("BMW refuel it");
    }
}

class Honda implements Car{

    public void start() {
        System.out.println("Honda start");
    }
    public void stop(){
        System.out.println("Honda stops");
    }
    public void refuel(){
        System.out.println("Honda refuel it");
    }
    public void advanced(){
        int total= rate*5;
        System.out.println("Add ons to honda model price " + total);
    }

}

class Interfacemain {
    public static void main(String[] args) {
    Car c = new BMW();
    c.start();
    c.stop();
    c.refuel();

    Car b = new Honda(); // dynamic polymorphism
    b.start();
    b.stop();
    b.refuel();
    ((Honda) b).advanced();
    }
}