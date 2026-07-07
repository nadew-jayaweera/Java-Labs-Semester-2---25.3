package Q02;

public class Staff{
    private String name;
    private int basicSalary;


    public Staff(String name, int basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;

    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getsalary(){
        return basicSalary;
    }
    public void setsalary(int basicSalary){
        this.basicSalary = basicSalary;
    }

    public int calculateSalary(){
        return basicSalary;
    }
}