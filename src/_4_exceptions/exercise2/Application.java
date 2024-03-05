package _4_exceptions.exercise2;

public class Application {

    public static void main(String[] args) {
        Sensor leuven = new TemperatureSensor();
        Sensor heverlee = new TemperatureSensor();
        Sensor kesselLo = new TemperatureSensor();

        AverageSensor regionLeuven = new AverageSensor();
        regionLeuven.addSensor(leuven);
        regionLeuven.addSensor(heverlee);
        regionLeuven.addSensor(kesselLo);

        regionLeuven.setOn();
        System.out.println("temperature in region Leuven " + regionLeuven.read() + " degrees Celsius");
        System.out.println("temperature in region Leuven " + regionLeuven.read() + " degrees Celsius");
        System.out.println("temperature in region Leuven " + regionLeuven.read() + " degrees Celsius");

        System.out.println("readings: " + regionLeuven.readings());
    }
}
