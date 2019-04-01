package AbstractSample;

public abstract class AbstractWithConstrc {
    AbstractWithConstrc(){   //Abstract class with constructor
        System.out.println("bike is created");
    }
    abstract void run();
    abstract void walk();

    void changeGear(){System.out.println("gear changed");}
}

//Creating a Child class which inherits Abstract class

class Honda extends AbstractWithConstrc {
    void run(){System.out.println("running safely..");}
    void walk(){
        System.out.println("Walking safely...");
    }
}

//Creating a Test class which calls abstract and non-abstract methods

class TestAbstraction2{
    public static void main(String args[]){
        AbstractWithConstrc obj = new Honda();
        obj.run();
        obj.walk();
        obj.changeGear();
    }
}
