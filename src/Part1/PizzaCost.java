package Part1;

import java.util.Scanner;
public class PizzaCost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double labour = 1.5;
        final double heat = 0.75;
        int top;
        double sizecost,topcost,total,size;
        System.out.print("Enter size of pizza (inches) > ");
        size = s.nextDouble();
        System.out.print("Enter number of toppings > ");
        top = s.nextInt();
        sizecost=size*0.50;
        topcost=top*0.75;
        total=labour+heat+sizecost+topcost;
        System.out.println("You have ordered a "+size+" inch pizza with "+top+" toppings");
        System.out.println(String.format("Heat Cost = %.2f",heat));
        System.out.println(String.format("Labour Cost = %.2f",labour));
        System.out.println(String.format("Toppings Cost = %.2f",topcost));
        System.out.println(String.format("Base Ingrediants Cost = %.2f",sizecost));
        System.out.println("__________________________________");
        System.out.println(String.format("Total Cost = %.2f",total));
    }
    
}
