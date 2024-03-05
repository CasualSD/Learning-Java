package _3_arrays_collections.exercise5;

import java.util.List;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> values = new ArrayList<Integer>();
        int greatest = 0;

        while(true){
            String input = scanner.nextLine();
            if(Integer.parseInt(input) == -1){
                System.out.println("Largest number: " + greatest);
                break;
            }

            if(greatest < Integer.parseInt(input)){
                greatest = Integer.parseInt(input);
            }
        }
    }
}
