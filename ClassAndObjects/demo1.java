class A{
    int i=10,b=20;
    public void display(){
        System.out.println("Value of i: "+i);
        System.out.println("Value of b: "+b);
    }
}
public class demo1 {
    public static void main(String[] args){
        A a1 = new A();
        a1.display();
    }
}
