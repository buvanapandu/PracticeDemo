package AbstractSample;

public abstract class AbstractVariableSample {
    static double loanInterest = 0.5;
    final int rate=4;
    int no = 001;
    abstract int getRateOfInterest();
}
class SBI extends AbstractVariableSample {
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends AbstractVariableSample {
    int getRateOfInterest(){
        return 8;
    }
}

class TestBank{
    public static void main(String args[]){
        AbstractVariableSample b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}
