package Inheritance;

public class MultiInherit {
    int initialSalary = 1000;
}
class Bonus extends MultiInherit{
    double bonus = initialSalary*0.1;
}
class Increment extends Bonus{
    int incrementValue = initialSalary *20;
}
class Promotion extends Increment{
    int promotionalIncrement  = initialSalary *25;
}
class MainInherit {
    public static void main(String[] args) {
        Promotion promotion = new Promotion();
        System.out.println(promotion.initialSalary);
        System.out.println(promotion.bonus);
        System.out.println(promotion.incrementValue);
        System.out.println(promotion.promotionalIncrement);
    }
}