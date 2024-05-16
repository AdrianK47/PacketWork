package Dice;

public class Dice3 {
    public static void main(String[] args){
        Dice max = new Dice();
        double percent = 0;
        double percent2 = 0;
        for (int i = 0; i >= 100; i++){
            max.roll();
            int total = max.getTotal();
            if (total == 7 || total == 11){
                percent += 1;
                System.out.println(percent);
            }
            else if (total == 2 || total == 3 || total == 12){
                percent2 += 1;
                System.out.println(percent2);
            }
        }
        double percentage = percent / 100;
        double percentage2 = percent2 / 100;
        System.out.println("You rolled a 7 or 11 " + "\t" + percentage + "% of the time");
        System.out.println("You rolled a 2, 3, or 12 " + "\t" + percentage2 + "% of the time");
    }
}
