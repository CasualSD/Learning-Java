package _1_introduction.exercise12;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a number:");
        String number = scanner.nextLine();
        int sum = 0;

        for(int i = 1; i <= Integer.parseInt(number); i++){
            sum += i;
        }
        
        System.out.println(sum);
    }
}
