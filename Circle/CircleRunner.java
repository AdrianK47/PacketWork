package Circle;

public class CircleRunner {
    public static void main(String[] args){
        Circle lukas = new Circle(3);
        double ik = lukas.getC();
        System.out.println("The circumference is: " + ik);

        double mb = lukas.getArea();
        System.out.println("The area is: " + mb);

        lukas.changeR(1);

        double bk = lukas.getArea();
        System.out.println("The new area is: " + bk);
    }
}
