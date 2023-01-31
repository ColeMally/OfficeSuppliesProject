public class SupplyTester {
    public static void main(String args[]){
        //CoffeeTester();
        LightbulbTester();
        
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
