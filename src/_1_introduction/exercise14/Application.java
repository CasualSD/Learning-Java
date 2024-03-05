package _1_introduction.exercise14;

public class Application {

    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(subtraction(2, 3));
        System.out.println(multiplication(2, 3));
        System.out.println(division(2, 3));

    }
    
    static double addition(double num1, double num2){
        return num1 + num2;
    }

    static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    static double division(double num1, double num2){
        return num1 / num2;
    }
}
