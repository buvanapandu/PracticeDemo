package TestFinalFinalizeFinally;

public class TestFinalize {
    public void finalize(){
        System.out.println("Finalize method will be called");
    }
    public static void main(String[] args) {
        TestFinalize tf1 = new TestFinalize();
//        TestFinalize tf2 = new TestFinalize();

        tf1= null;
  //      tf2= null;

        System.gc();
    }
}
