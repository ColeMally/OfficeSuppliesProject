public class SupplyTester {
    public static void main(String args[]){
        CoffeeCup c = new CoffeeCup();
        System.out.println(c.getCapacity());
        c.getAmount();
        c.fill();
        c.getAmount();
        c.drink();
        c.getAmount();
        c.drink();
        c.getAmount();

    }
}
