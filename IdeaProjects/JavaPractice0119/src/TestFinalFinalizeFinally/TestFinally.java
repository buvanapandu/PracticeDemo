package TestFinalFinalizeFinally;



public class TestFinally {
    public static void main(String[] args) {
    //test1(); // we call method without creating object if its  static method
    //test2();  // we call method without creating object if its  static method
    division();
    }
    public static void test1(){
        try{
            System.out.println("Test1 method");
            throw new RuntimeException("test");
        }catch (Exception e){
            System.out.println("Catch method");
        }

        finally {
            System.out.println("Inside final block method");
        }
    }
    public static void test2(){
        try{
            System.out.println("Test 2 method");
        }
        finally {
            System.out.println("Test2 finally block");
        }
    }
    public static void division(){
        int i=10;
        try{
            System.out.println("Inside division try block");
            int k=i/0;
        }catch (ArithmeticException e){
            System.out.println("Inside division catch block");
            System.out.println("divide by zero error");
        }
        finally {
            System.out.println("Inside division finally block");
        }
    }
}
