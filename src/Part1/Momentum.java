package Part1;

import java.util.Scanner;
public class Momentum {

    public static void main(String[] args) {
        double mass, velocity, momentum;
        Scanner s = new Scanner(System.in);
        //ask for data
        System.out.print("Enter objects mass (in kg) >> ");
        mass = s.nextDouble();
        System.out.print("Enter objects velocity (in m/s) >> ");
        velocity = s.nextDouble();
        //calculate momentum
        momentum = mass*velocity;
        System.out.println(String.format("The object's momentum is %.2f", momentum));
    }
    
}
