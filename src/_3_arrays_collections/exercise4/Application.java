package _3_arrays_collections.exercise4;

import java.util.List;
import java.util.ArrayList;
public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> values = new ArrayList<Integer>();

        while(true){
            String input = scanner.nextLine();
            if(Integer.parseInt(input) == -1){
                break;
            }

            try{
                values.add(Integer.parseInt(input));
            }
            catch(Exception e){
                System.out.println("Values entered must be integers.");
            }
        }

        String startIndexInput = "";
        String endIndexInput = "";

        System.out.print("Start index? ");
        startIndexInput = scanner.nextLine();

        System.out.print("End index? ");
        endIndexInput = scanner.nextLine();

        int start = Integer.parseInt(startIndexInput);
        int end = Integer.parseInt(endIndexInput);
        for(int i = start; i <= end; i++ ){
            System.out.println(values.get(i));
        }
    }
}
