import java.util.ArrayList;

public class Airpods {
    //fields
    private int durability;
    private int battery;
    private boolean connected;
    private boolean charging;
    private ArrayList<String> playlist;

    //constructors
    public Airpods(int myBattery, boolean myConnected, boolean myCharging){
        durability = 100;
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
        durability -= 1;
        if(battery == 0){
            System.out.println("The airpods are dead");
        }
        return battery;

    }

    public ArrayList<String> playlistCreation(){
        playlist.add("20 Min, Lil Uzi");
        playlist.add("Is This It, the Strokes");
        playlist.add("The Bug Collector, Haley Heynderickx");
        playlist.add("She, Tyler the Creator");
        playlist.add("What Kind of Love, Childish Gambino");
        playlist.add("Tell Your Friends");
        playlist.add("Dark Red, Steve Lacy");
        playlist.add("Ontheway, Earl Sweatshirt");
        playlist.add("Sundress, A$AP Rocky");
        playlist.add("Everlong, Foo Fighters");
        return playlist;








    }
}
