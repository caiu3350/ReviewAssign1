package Part2;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2,answer = 0,remain = 0;
            System.out.print("Enter your first number -> ");
            num1=s.nextInt();
            System.out.print("Enter your second number -> ");
            num2=s.nextInt();
            if(num1>num2){
                answer=num1/num2;
                remain=num1%num2;
            }
            else if(num2>num1){
                answer=num2/num1;
                remain=num2%num1;
            }
            else if(num2==num1){
                answer=num1/num2;
                remain=num1%num2;
            }
            System.out.println(answer+" r"+remain);
    }
    
}
