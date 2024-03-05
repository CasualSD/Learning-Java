package _1_introduction.exercise5;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Your age:");
        String userAge = scanner.nextLine();

        if (Integer.parseInt(userAge) >= 18 ){
            System.out.println("Of age? Yes");
        }
        else{
            System.out.println("Of age? No");
        }
    }
}
