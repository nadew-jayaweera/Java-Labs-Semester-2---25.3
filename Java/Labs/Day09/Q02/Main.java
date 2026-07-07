package Q02;

public class Main {
    public static void main(String[] args){
        Staff em = new Staff("Navitha",67000 );

        Supervisor sup = new Supervisor("Heshan", 100000, 10);

        System.out.println(em.calculateSalary());
        System.out.println("");
        System.out.println(sup.calculateSalary());
    }
}
