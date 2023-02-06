/**
 * @author Cole Mallinger and Junaid Bhatti
 * @version 02/01/2023
 * This code creates a Lightbulb class with five seperate methods
 */
public class Lightbulb {
    //fields
    private int light;

    //constructors
    public Lightbulb(){
        light = 0;
    }

    //methods
    /**
     * Sets light power to 100
     * @return int light
     */
    public int turnOn(){
        light = 100;
        return light;
    }
    /**
     * Sets light power to 0
     * @return int light
     */
    public int turnOff(){
        light = 0;
        return light;
    }
    /**
     * Increases light power by 50
     * @return int light
     */
    public int Brighten(){
        light += 50;
        if(light >= 100){
            light = 100;
        }
        return light;
    }
    /**
     * Lowers light power by 50
     * @return int light
     */
    public int Dim(){
        light -= 50;
        if(light <= 0){
            light = 0;
        }
        return light;
    }
    /**
     * Gets light power
     * @return int light
     */
    public int getLight(){
        return light;
    }

}
