public class Airpods {
    //fields
    private int durability;
    private int battery;
    private boolean connected;
    private boolean charging;

    //constructors
    public Airpods(int myDurability, int myBattery, boolean myConnected, boolean myCharging){
        durability = myDurability;
        battery = myBattery;
        connected = myConnected;
        charging = myCharging;
    }


    //methods
    public boolean Connect(){
        connected = true;
        return connected;
    }
    public boolean Disconnect(){
        connected = false;
        return connected;
    }
    public boolean Charge(){
        charging = true;
        return charging;
    }
    public boolean notCharging(){
        charging = false;
        return charging;
    }

    public boolean checkCharging(){
        if(charging == true){
            battery += 5;
        }else{
            System.out.println("The case is not charging");
        }
        System.out.println(battery);
        return charging;

    }
    public int useAirpods(){
        battery -= 10;
        return battery;
    }
}
