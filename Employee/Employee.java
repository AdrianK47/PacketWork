package Employee;

public class Employee {
    private double salary;

    public Employee(double a){
        salary = a;
    }

    public void increase(double b){
        if (b < 0){
            b = 0;
        }
        salary = salary + b;
    }

    public double getPay(){
        return salary;
    }
}
