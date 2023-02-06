/**
 * @author Cole Mallinger and Junaid Bhatti
 * @version 02/01/2023
 * This code creates a coffee cup class with five seperate methods
 */

/**
 * Fields: amount in coffee cup interger and capacity of cup integer
 */
 public class CoffeeCup {
    private int amount;
    private int capacity;
/**
 * Constructors: Starts with zero and has a capacity of 16
 */
    public CoffeeCup(){
        amount = 0;
        capacity = 16;
    }
/**
 * Removes coffee from cup with chance to spill
 */
    public void drink(){
        if(amount < 8){
            amount = 0;
        } else{
            amount -= 8;
        }
        int val = (int) (Math.random() * 4) + 1;
        if(val == 4){
            spill();
        }
    }
/**
 * Fills cup to capacity
 */
    public void fill(){
        amount = capacity;
        if(amount == 16){
            System.out.println("The cup is full!");
        }
        
    }
/**
 * Gets amount in coffee cup
 * @return
 */
    public int getAmount(){
       return amount;
    }
/**
 * Gets capacity of coffee cup
 * @return
 */
    public int getCapacity(){
        return capacity;
    }
/**
 * Sets coffee amount to zero and acts on a 1/4 chance
 */
    private void spill(){
        amount = 0;
        System.out.println("Uh Oh! You spilled your coffee! Need to fill!");
    }

}
