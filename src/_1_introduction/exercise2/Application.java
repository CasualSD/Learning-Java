package _1_introduction.exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //java.util.Scanner scanner = new java.util.Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your first number?");
        String numberOne = scanner.nextLine();
        
        System.out.println("What is your second number?");
        String numberTwo = scanner.nextLine();
        
        System.out.println("What is your third number?");
        String numberThree = scanner.nextLine();

        int average = (Integer.parseInt(numberOne) + Integer.parseInt(numberTwo) + Integer.parseInt(numberThree)) / 3;
        
        System.out.println("The average of these three numbers is: " + average);

    }
}
