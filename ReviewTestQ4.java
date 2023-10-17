/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package reviewtestq4;
import java.util.Scanner;


public class ReviewTestQ4 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number 1 or 2");
         
         int number = input.nextInt();
         
         if (number == 1) {
             System.out.println("Hello");
         } else if (number == 2){
             System.out.println("Good bye");
         }
    }
}
