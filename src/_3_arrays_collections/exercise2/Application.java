package _3_arrays_collections.exercise2;

import java.util.List;
import java.util.ArrayList;
public class Application {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        
        while(input != ""){
            String[] inputArray = input.split(" ");
            System.out.println(inputArray[inputArray.length - 1]);
            input = scanner.nextLine();
        }
    }
}
