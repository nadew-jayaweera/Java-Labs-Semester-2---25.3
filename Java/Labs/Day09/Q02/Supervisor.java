package Q02;

public class Supervisor extends Staff {

    private int teamsize;
    
    public Supervisor(String name, int basicSalary, int teamsize ){
        super(name, basicSalary);
        this.teamsize = teamsize;

    }

    @Override

    public int calculateSalary(){
        int bonus = teamsize * 1000;
        return getsalary() + bonus;
    }

}
