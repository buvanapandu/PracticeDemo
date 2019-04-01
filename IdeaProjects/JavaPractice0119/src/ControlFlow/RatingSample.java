package ControlFlow;

public class RatingSample {
    public static void main(String[] args) {
        int rating = 4; //

        if (rating >= 0 && rating <= 5) {
            if (rating <= 2) {
                System.out.println("Reason for low rating");
            }
            System.out.println("Thanks for rating us!");
        }
    }
}
