package _1_introduction.exercise10;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> numbersList = new ArrayList<Integer>();
        int sum = 0;


        System.out.println("Keep entering numbers until you enter a negative number:");
        String number = scanner.nextLine();

        while (Integer.parseInt(number) > 0){
            numbersList.add(Integer.parseInt(number));
            number = scanner.nextLine();
        }

        for (Integer i : numbersList) {
         sum += i;   
        }
        
        System.out.println(sum / numbersList.size());

        
    }
}
