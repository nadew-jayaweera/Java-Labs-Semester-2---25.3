public class C1 {
    int n1,n2;
    C1(){

    }
    int addNum(int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args){
        C1 c1 = new C1();
        System.out.println("Sum is "+ c1.addNum(10,20));
    }

}