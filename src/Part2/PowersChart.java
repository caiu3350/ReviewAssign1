package Part2;

import java.util.Scanner;

public class PowersChart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int expo, answer = 0;
        while(true){
        System.out.print("Enteran exponent between 0 to 10 -> ");
        expo = s.nextInt();
        if(expo>=0&&expo<=10)break;
        else{
            System.out.println("Error - enter valid number");
        }
        }
            System.out.println("2^Exponent -> Answer");
            System.out.println("----------");
            for (int x = 0; x <= expo; x++) {
            answer=(int) Math.pow(2, x);
            System.out.println("2^"+x+" -> "+answer);
            System.out.println("----------");
            }
        
    }
    
}
