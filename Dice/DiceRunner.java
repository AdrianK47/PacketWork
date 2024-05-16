package Dice;

public class DiceRunner {
    public static void main(String[] args){
        Dice brandon = new Dice();
        brandon.roll();
        int max = brandon.getTotal();
        System.out.println("The sum of the dice is: " + max);

        brandon.roll();
        max = brandon.getTotal();
        System.out.println("The sum of the new roll of dice is: " + max);
    }
}
