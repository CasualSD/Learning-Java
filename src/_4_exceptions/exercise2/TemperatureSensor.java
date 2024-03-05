package _4_exceptions.exercise2;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean sensorIsOn;

    public TemperatureSensor(){
        this.sensorIsOn = false;
    }

    public boolean isOn(){
        return sensorIsOn;
    }
    
    public void setOn(){
        sensorIsOn = true;
    }
    
    public void setOff(){
        sensorIsOn = false;
    }
    
    public int read(){
        if(!isOn()){
            throw new IllegalStateException();
        }
        
        Random randomNumber = new Random();
        return randomNumber.nextInt(61) - 30;
    }
}
