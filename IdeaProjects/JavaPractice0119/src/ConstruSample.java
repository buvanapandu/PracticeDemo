public class ConstruSample {
    int n;
    String name; // Default constructors returning null here bcos no values are passed
    void disp(){
        System.out.println(n + " " + name  + "  Default constructors returning null here bcos no values are passed");
    }
    public static void main(String args[]){
        ConstruSample b=new ConstruSample();
        ConstruSample b1=new ConstruSample();
        b.disp();
        b1.disp();
    }
}
