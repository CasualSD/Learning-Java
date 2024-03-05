package _4_exceptions.exercise2;

import java.util.List;
import java.util.ArrayList;


public class AverageSensor implements Sensor{
    private List<Sensor> sensorList;
    private boolean sensorIsOn;
    private List<Integer> readings;


    public AverageSensor(){
        this.sensorList = new ArrayList<Sensor>();
        this.sensorIsOn = false;
        this.readings = new ArrayList<Integer>();
    }
    
    public boolean isOn(){
        return sensorIsOn;
    }
    
    public void setOn(){
        for(Sensor sensor : sensorList){
            sensor.setOn();
        }
        sensorIsOn = true;
    }
    
    public void setOff(){
        for(Sensor sensor : sensorList){
            sensor.setOff();
        }
        sensorIsOn = false;
    }
    
    public int read(){
        if(!sensorIsOn || sensorList.isEmpty()){
            throw new IllegalStateException();
        }

        int total = 0;
        int averageTemp = 0;
        for(Sensor sensor : sensorList){
            total += sensor.read();
        }

        averageTemp = total / sensorList.size();
        readings.add(averageTemp); 

        return averageTemp;
    }

    public void addSensor(Sensor toAdd){
        sensorList.add(toAdd);
    }

    public List<Integer> readings(){
        return readings;
    }
}
