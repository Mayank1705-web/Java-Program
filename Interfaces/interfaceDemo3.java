interface A{
    void display();
}
class B implements A{
    public void display(){
        System.out.println("Hello from interface A");
    }
}
class C implements A{
    public void display(){
        System.out.println("Hello from interface A");
    }
}
public class interfaceDemo3 {
    public static void main(String[] args){
        B b1 = new B();
        C c1 = new C();
        b1.display();
        c1.display();
    }
}
