public class AccessSample {
    protected int z=10;
    private int y =67;

    public void print(){
        System.out.println("Welcome");
    }

}
class pub {
    public static void main(String[] args) {
        AccessSample ac = new AccessSample();
        ac.print();
        ac.z=25;
        //ac.y=45; // cant change value when its in private
    }
}
