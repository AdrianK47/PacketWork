package Dice;

public class Dice3 {
    public static void main(String[] args){
        Dice max = new Dice();
        double percent = 0;
        double percent2 = 0;
        for (int i = 0; i <= 100; i++){
            max.roll();
            int test = max.getTotal();
            System.out.println(test);
            if (max.getTotal() == 7 || max.getTotal() == 11){
                percent = percent + 1;
            }
            else if (max.getTotal() == 2 || max.getTotal() == 3 || max.getTotal() == 12){
                percent2 = percent2 + 1;
            }
        }
        System.out.println("You rolled a 7 or 11 " + "        " + percent + "% of the time");
        System.out.println("You rolled a 2, 3, or 12 " + "    " + percent2 + "% of the time");
    }
}
