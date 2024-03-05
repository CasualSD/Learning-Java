package _4_exceptions.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        int total = 0;

        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")){
                for(int number : numbers){
                    total += number;
                }
                total = total / numbers.size();
                System.out.println("average: " + total);
                break;
            }

            try{
                numbers.add(Integer.parseInt(input));
            }
            catch(Exception e){
                System.out.println("You may only enter numbers or end.");
            }
        }
    }
}
