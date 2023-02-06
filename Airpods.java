/**
 * @author Cole Mallinger and Junaid Bhatti
 * @version 02/01/2023
 * This code creates a an airpods class with 10 methods
 */
import java.util.ArrayList;

public class Airpods {
    //fields
    private int durability;
    private int battery;
    private boolean connected;
    private boolean charging;
    private ArrayList<String> playlist;

    //constructors
    public Airpods(){
        durability = 100;
        battery = 100;
        playlist = new ArrayList<String>();
    }


    //methods
    /**
     * Check if airpods are connected
     * @return boolean
     */
    public boolean Connect(){
        connected = true;
        return connected;
    }
    /**
     * Check if airpods are disconnected
     * @return boolean
     */
    public boolean Disconnect(){
        connected = false;
        return connected;
    }
/**
 * Checks if charging
 * @return boolean
 */
    public boolean checkCharge(){
        charging = true;
        return charging;
    }
/**
 * Checks if not charging
 * @return boolean
 */
    public boolean notCharging(){
        charging = false;
        return charging;
    }
/**
 * Sets airpod battery to full
 */
    public void charge(){
        if(charging == true){
            battery = 100;
            System.out.println("Airpods are charged!");
        }else{
            System.out.println("The case is not charging");
        }
    }
/**
 * Decreases airpod battery
 * @return int battery
 */
    public int useAirpods(){
        battery -= 10;
        durability -= 1;
        if(battery == 0){
            System.out.println("The airpods are dead");
        }
        return battery;

    }
/**
 * Removes song from playlist
 * @return String song
 */
    public String playsong(){
       return playlist.remove(0);
    }
    
/**
 * Gets durability of airpods
 * @return int durability 
 */
    public int getDurability(){
        return durability;
    }
/**
 * Gets battery of airpods
 * @return int battery
 */
    public int getBattery(){
        return battery;
    }
/**
 * Adds songs to playlist
 */
    public void addSongs(){
        playlist.add("20 Min, Lil Uzi");
        playlist.add("Is This It, the Strokes");
        playlist.add("The Bug Collector, Haley Heynderickx");
        playlist.add("She, Tyler the Creator");
        playlist.add("What Kind of Love, Childish Gambino");
    }

}
