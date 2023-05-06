package activities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String>Passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.Passengers=new ArrayList<>();
    }
    public void onboard(String passengers){
        this.Passengers.add(passengers);

    }
    public Date takeOff(){
        //LocalDateTime takeOffTime= LocalDateTime.now();
        this.lastTimeTookOff=new Date();
        return lastTimeTookOff;
        //System.out.println("Take off time:"+takeOffTime);
        //this.Passengers.clear();
    }
    public Date land(){
        this.lastTimeLanded=new Date();
        return lastTimeLanded;
    }
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    public List<String> getPassengers(){

        return Passengers;

    }
}
