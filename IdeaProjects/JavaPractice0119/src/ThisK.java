public class ThisK {
    int no;
    String name;

    ThisK(int no, String name){
        this.no = no;
        this.name = name;
    }
    void display(){
        System.out.println("Welcome to hello world");
    }

    public static void main(String[] args) {
        ThisK tk = new ThisK(10, "Aasfasf");
        tk.display();
    }

}
