public class ParamConstru {
    int id;
    String name;
        //creating a parameterized constructor
   ParamConstru(int i,String n){
       id = i;
       name = n;
   }
   //method to display the values
   void display(){
       System.out.println(id+" "+name);
       }

   public static void main(String args[]){
       //creating objects and passing values
       ParamConstru s1 = new ParamConstru(111,"Karan");
       ParamConstru s2 = new ParamConstru(222,"Aryan");
       //calling method to display the values of object
       s1.display();
       s2.display();
   }
}

