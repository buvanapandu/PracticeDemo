package ControlFlow;

public class LogicSample {
    public static void main(String[] args) {
        int age = 0;
        boolean isStudent = false;
        int ticketPrice =10;

        if (age <= 15 || age > 60 || isStudent == true) {
            ticketPrice =5;
        } else {
            ticketPrice = 10;
        }
    }
}
