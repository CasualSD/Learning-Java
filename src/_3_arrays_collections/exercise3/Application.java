package _3_arrays_collections.exercise3;

import java.util.List;
import java.util.ArrayList;
public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<String> names = new ArrayList<String>();
        List<Integer> ages = new ArrayList<Integer>();
        int oldest = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.isBlank()){
                if(names.isEmpty()){
                    System.out.println("No inputs were given.");
                }
                else{
                    for(int i = 0; i < names.size(); i++){
                        if(oldest < ages.get(i)){
                            oldest = ages.get(i);
                        }
                        
                        System.out.println(names.get(i)+ "," + ages.get(i));
                    }
                    System.out.println("Age of the oldest: " + oldest);
                }
                break;
            }
            
            String[] inputArray = input.split(",");
            if(inputArray.length == 2){
                try{
                    names.add(inputArray[0]);
                    ages.add(Integer.parseInt(inputArray[1]));
                }
                catch(Exception e){
                    System.out.println("The age must be a number!");
                    names.remove(names.size() - 1);
                }
            }
            else{
                System.out.println("Please put a name and an age seperated by a comma(,)");
            }
        }
    }
}
