package Q3;

public class Main {
    public static void main(String[] args){
        Employee e[] = new Employee[3];

        e[0] = new Developer();
        e[1] = new Employee();
        e[2] = new Designer();

        e[0].work();
        e[1].work();
        e[2].work();
    }
}
