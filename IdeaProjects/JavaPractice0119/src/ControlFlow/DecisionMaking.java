package ControlFlow;

public class DecisionMaking {
    public static void main(String[] args) {
        boolean isLightGreen= false;
        boolean isLightYellow = false;

        if(isLightGreen){
            System.out.println("Drive");
        }else if(isLightYellow){
            System.out.println("Slow Down");
        }else {
            System.out.println("Stop");
        }

        boolean windshield=true;
        if(windshield){
            System.out.println("Raining on");
        }

        boolean isStudent =true;
        int age = 80;
        int ticketPrice =10;

        if(isStudent == false){
            ticketPrice = 5;
            System.out.println(ticketPrice);
        }else if(age <=15){
            ticketPrice =5;
            System.out.println(ticketPrice);
        }else if(age >=60){
            ticketPrice =5;
            System.out.println(ticketPrice);
        }else{
            ticketPrice =10;
            System.out.println(ticketPrice);
        }

        if(isStudent || age <=15 || age >60){
            ticketPrice =5;
            System.out.println(ticketPrice);
        }else{
            ticketPrice =10;
            System.out.println(ticketPrice);
        }
    }
}
