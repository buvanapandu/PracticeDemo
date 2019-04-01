package AbstractSample;

public abstract class Shape {
    abstract void draw(); // abstract class

    final void color() { // Final keyword used method which is final method
        System.out.println("Color ur shape");
    }
    void border(){
        System.out.println("Pick your border width");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Draw rectangle");
    }
    void getShape(){
        System.out.println("Get shapes of rectagle");
    }

}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Draw Square");
    }
}
class Runmain{
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
        s.color();
        s.border();

        System.out.println(" ");
        System.out.println("###########");

        Shape s1 = new Square();
        s1.draw();
        s1.color();

        System.out.println(" ");
        System.out.println("###########");

        Rectangle r = new Rectangle();
        r.draw();
        r.getShape();
        r.color();
        r.border();
    }
}
