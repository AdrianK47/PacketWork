package Box;
public class BoxRunner {
    public static void main(String args[]){
        Box ian = new Box(2,6);
        double lw = ian.getArea();
        System.out.println("The area is: " + lw);

        ian.bigger(2);

        double ak = ian.getPerimeter();
        System.out.println("The doubled perimeter is " + ak);


    }
}
