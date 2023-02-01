public class SupplyTester {
    public static void main(String args[]){
        System.out.println("Coffee Tester");
        CoffeeTester();
        System.out.println();
        System.out.println();
        System.out.println("Lightbulb Tester");
        LightbulbTester();
        System.out.println();
        System.out.println();
        System.out.println("Airpod Tester");
        AirpodsTester();
        
    } 

    public static void AirpodsTester(){
        Airpods pods = new Airpods();
        System.out.println("Airpods Durability: " + pods.getDurability());
        System.out.println("Airpods Battery: " + pods.getBattery());
        System.out.println();
        System.out.println("Connecting airpods...");
        System.out.println("Airpods Connected: " + pods.Connect());
        System.out.println();
        System.out.println("Playing playlist...");
        pods.addSongs();
        System.out.println("Song playing now: " + pods.playsong());
        pods.useAirpods();
        System.out.println("Playing next song...");
        System.out.println("Song playing now: " + pods.playsong());
        pods.useAirpods();
        System.out.println("Playing next song...");
        System.out.println("Song playing now: " + pods.playsong());
        pods.useAirpods();
        System.out.println("Playing next song...");
        System.out.println("Song playing now: " + pods.playsong());
        pods.useAirpods();
        System.out.println("Playing next song...");
        System.out.println("Song playing now: " + pods.playsong());
        pods.useAirpods();
        System.out.println();
        System.out.println("Airpods Durability: " + pods.getDurability());
        System.out.println("Airpods Battery: " + pods.getBattery());
        System.out.println();
        System.out.println("We need to charge our Airpods!");
        pods.charge();
        System.out.println("Plug in airpods!");
        System.out.println("Airpods Charging: " + pods.checkCharge());
        System.out.println("We can charge airpods now!");
        pods.charge();
        System.out.println();
        System.out.println("Airpods Durability: " + pods.getDurability());
        System.out.println("Airpods Battery: " + pods.getBattery());
        System.out.println();
        System.out.println("Uh oh Mr. Rosato is coming! Disconnect the airpods!");
        pods.Disconnect();
        System.out.println("Airpod connection: " + pods.Disconnect());

    }

    public static void LightbulbTester(){
        Lightbulb bulby = new Lightbulb();
        System.out.println("The brightness of the light is: " +bulby.getLight());
        System.out.println("The room is dark! Turn on the lights.");
        bulby.turnOn();
        System.out.println("The brightness of the light is: " +bulby.getLight());
        System.out.println("The room is too bright! Dim the lights.");
        bulby.Dim();
        System.out.println("The brightness of the light is: " +bulby.getLight());
        System.out.println("Nevermind! Turn it back up!");
        bulby.Brighten();
        System.out.println("The brightness of the light is: " +bulby.getLight());
        System.out.println("Leaving the room! Turn off the lights!");
        bulby.turnOff();
        System.out.println("The brightness of the light is: " +bulby.getLight());

    }
    public static void CoffeeTester(){
        CoffeeCup c = new CoffeeCup();
        System.out.print("The capacity of the cup is: ");
        System.out.println(c.getCapacity());
        System.out.print("The amount in the cup is: ");
        System.out.println(c.getAmount());
        System.out.println("Fill the cup");
        c.fill();
        System.out.println(c.getAmount());
        System.out.println("Take a sip of Joe!");
        c.drink();
        System.out.print("The amount in the cup is: ");
        System.out.println(c.getAmount());
        if(c.getAmount() == 0){
            System.out.println("You spilled all your coffee! So sad!");
        } else {
            System.out.println("Finish that coffee!");
            c.drink();
            System.out.print("The amount in the cup is: ");
            System.out.println(c.getAmount());
        }
    }   
}
