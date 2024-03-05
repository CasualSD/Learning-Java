package _1_introduction.exercise3;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Input a tempature in Celsius:");
        String tCelcius = scanner.nextLine();

        double tFahrenheit = (Integer.parseInt(tCelcius) * 9/5) + 32;
        double tKelvin = Integer.parseInt(tCelcius) + 273.15;

        System.out.println("Converted to fahrenheit: " + tFahrenheit + "\nConverted to kelvin: " + tKelvin);
    }
}
