package _1_introduction.exercise9;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a number:");
        String number = scanner.nextLine();

        int intNumber = Integer.parseInt(number);

        if(intNumber % 3 == 0 && intNumber % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(intNumber % 3 == 0){
            System.out.println("Fizz");
        }
        else if(intNumber % 5 == 0){
            System.out.println("Buzz");
        }
        else{ System.out.println(intNumber); }
    }
}
