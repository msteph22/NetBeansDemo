
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephensmac
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Miles:");
        double miles = keyboard.nextDouble();
        System.out.println("Gallons:");
        double gallons = keyboard.nextDouble();
        double mpg = calculateMPG(miles, gallons);
        System.out.println("You got " + mpg);
    }
    
    public static int addNumbers(int x,int y){
        return x + y;
    }
    public static double calculateMPG(double miles, double gallons){
        double result = miles/ gallons;
        return result;
    }
}
