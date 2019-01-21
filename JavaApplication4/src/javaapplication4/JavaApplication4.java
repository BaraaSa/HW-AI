
package javaapplication4;

import java.util.Scanner;  
public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number :");
        int num = input.nextInt();
        System.out.println("all number which devisor of" + num);
        for (int i =1;i <= num; i++){
            if (num % i==0){
                System.out.print( i + " | ");
            }
        }
        
    }
    
}
