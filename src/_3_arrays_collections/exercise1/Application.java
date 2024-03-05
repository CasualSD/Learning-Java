package _3_arrays_collections.exercise1;

import java.util.ArrayList;
import java.util.List;
public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<String> userInputList = new ArrayList<String>();
        String input = scanner.nextLine();
        String word = "";

        while (input != "") {
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) != ' '){
                    word += input.charAt(i);
                }
                else{
                    userInputList.add(word);
                    word = "";
                }
            }
            if(input.charAt(input.length() - 1) != ' '){
                userInputList.add(word);
            }
            
            for(String inputWord : userInputList){
                if (inputWord.contains("av")) {
                    System.out.println(inputWord);
                }
            }

            userInputList.clear();
            word = "";
            input = scanner.nextLine();
        }
    }
}
