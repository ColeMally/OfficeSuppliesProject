public class Lightbulb {
    //fields
    private int light;

    //constructors
    public Lightbulb(){
        light = 0;
    }

    //methods
    public int turnOn(){
        light = 100;
        return light;
    }
    public int turnOff(){
        light = 0;
        return light;
    }
    public int Brighten(){
        light += 50;
        if(light >= 100){
            light = 100;
        }
        return light;
    }
    public int Dim(){
        light -= 50;
        if(light <= 0){
            light = 0;
        }
        return light;
    }
    public int getLight(){
        return light;
    }

}
