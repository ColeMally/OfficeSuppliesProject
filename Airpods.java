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
    public boolean Connect(){
        connected = true;
        return connected;
    }
    public boolean Disconnect(){
        connected = false;
        return connected;
    }

    public boolean checkCharge(){
        charging = true;
        return charging;
    }
    public boolean notCharging(){
        charging = false;
        return charging;
    }

    public void charge(){
        if(charging == true){
            battery = 100;
            System.out.println("Airpods are charged!");
        }else{
            System.out.println("The case is not charging");
        }
    }

    public int useAirpods(){
        battery -= 10;
        durability -= 1;
        if(battery == 0){
            System.out.println("The airpods are dead");
        }
        return battery;

    }

    public String playsong(){
       return playlist.remove(0);
    }
    

    public int getDurability(){
        return durability;
    }

    public int getBattery(){
        return battery;
    }

    public void addSongs(){
        playlist.add("20 Min, Lil Uzi");
        playlist.add("Is This It, the Strokes");
        playlist.add("The Bug Collector, Haley Heynderickx");
        playlist.add("She, Tyler the Creator");
        playlist.add("What Kind of Love, Childish Gambino");
    }

}
