package _1_introduction.exercise7;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a word:");
        String wordOne = scanner.nextLine();

        System.out.println("Enter an another word:");
        String wordTwo = scanner.nextLine();
        
        if(wordOne.equals(wordTwo)){
            System.out.println("Equal!");
        }
        else{System.out.println("Not equal!");}
    }
}
