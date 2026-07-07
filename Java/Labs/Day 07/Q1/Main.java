package Q1;

public class Main {
    public static void main(String[] args) {

        calculator calc[] = new calculator[3];

        calc[0] = new calculator();
        calc[1] = new calculator();
        calc[2] = new calculator();

        System.out.println(calc[0].add(6, 9));
        System.out.println(calc[1].add(6, 7, 7));
        System.out.println(calc[2].add(6.5, 7.5));
    }
}