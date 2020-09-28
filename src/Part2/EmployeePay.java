package Part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours=0;
        float overtime=0,totalpay=0,regularpay = 0;
        for (int x = 1; x <= 5; x+=1) {
            while(true){
                System.out.print("Enter hours worked for Employee "+x+" -> ");
                hours = s.nextInt();
                if(hours>=1&&hours<=70)break;
                else{
                    System.out.println("Invalid, try again");
                }
        }
            if(hours<=40){
                regularpay=hours*15;
                overtime=0;
                totalpay=regularpay+overtime;
            }
            else if(hours>40){
                regularpay=40*15;
                overtime=(float) ((hours-40.0)*22.5);
                totalpay=regularpay+overtime;
            }
            System.out.println(String.format("Regular Pay:  $%.2f",regularpay));
            System.out.println(String.format("Overtime Pay: $%.2f",overtime));
            System.out.println(String.format("Total Pay:    $%.2f",totalpay));
            System.out.println("--------------------------------------");
            
    }
    
}
}