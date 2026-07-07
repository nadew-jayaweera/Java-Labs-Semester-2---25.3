package Q03;


public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Alice", 80000, "Engineering");
        Developer dev = new Developer(102, "Bob", 60000, "Java");

        System.out.println(mgr.getName() + " Bonus: " + mgr.calculateBonus());
        System.out.println(dev.getName() + " Bonus: " + dev.calculateBonus());
    }
}
