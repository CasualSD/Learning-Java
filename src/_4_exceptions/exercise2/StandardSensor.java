package _4_exceptions.exercise2;

public class StandardSensor implements Sensor{
    private int sensorValue;

    public StandardSensor(int sensorValue){
        this.sensorValue = sensorValue;
    }

    public boolean isOn(){
        return false;
    }
    
    public void setOn(){

    }
    
    public void setOff(){

    }
    
    public int read(){
        return sensorValue;
    }
}
