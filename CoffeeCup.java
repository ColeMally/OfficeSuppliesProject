public class CoffeeCup {
    private int amount;
    private int capacity;
    
    public CoffeeCup(){
        amount = 0;
        capacity = 16;
    }

    public void drink(){
        int val = (int) (Math.random() * 4) + 1;
        amount -= 8;
        if(amount == 0){
            System.out.println("The cup is empty. Need to fill!");
        }
        if(val == 4){
            spill();
        }
    }

    public void fill(){
        amount = capacity;
        if(amount == 16){
            System.out.println("The cup is full!");
        }
        
    }
    
    public int getAmount(){
        return amount;
    }

    public int getCapacity(){
        return capacity;
    }

    private void spill(){
        amount = 0;
        System.out.println("Uh Oh! You spilled your coffee! Need to fill!");
    }

}
