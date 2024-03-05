package _1_introduction.exercise11;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the amount of rows:");
        String rows = scanner.nextLine();
        String stars = "";

        for(int i = 0; i < Integer.parseInt(rows) ; i++){
            stars += "*";
            System.out.println(stars);
        }
    }
}
