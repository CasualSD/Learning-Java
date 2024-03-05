package _1_introduction.exercise6;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the first number:");
        String numberOne = scanner.nextLine();
        
        System.out.println("Enter the second number:");
        String numberTwo = scanner.nextLine();

        if (Integer.parseInt(numberOne) == Integer.parseInt(numberTwo)){
            System.out.println("Equal");
        }
        else if (Integer.parseInt(numberOne) > Integer.parseInt(numberTwo)){
            System.out.println(numberOne);
        }
        else System.out.println(numberTwo);
    }
}
