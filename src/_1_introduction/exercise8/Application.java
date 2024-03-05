package _1_introduction.exercise8;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Input an age:");
        String age = scanner.nextLine();

        if(120 >= Integer.parseInt(age) && Integer.parseInt(age) >= 0){
            System.out.println("Ok");
        }
        else{ System.out.println("Impossible!"); }

    }
}
