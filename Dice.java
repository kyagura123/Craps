
/**
 * Write a description of class Dice here.
 *
 * @author Kaylin Yagura
 * @version 1/11/22
 */
public class Dice
{
    private int sides;
    private int number;
    private int counter;
    

    /**
     * Constructor for objects of class Dice
     * @param sides of the dice
     */
    public Dice(int sides, int number)
    {
        this.sides = sides;
        this.number = number;
        this.counter = counter;
    }
    
    
    public int roll(){
        counter = 0;
        
        for(int x = 0; x<number; x++){
        
        int number_rolled = (int)((Math.random()*sides)+1);
        counter += number_rolled;
    }
    return counter;
    }
    
    public int getRoll(){
        return counter;
    }

}
