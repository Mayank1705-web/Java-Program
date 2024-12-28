interface A{
    void display();
}
class B implements A{
    public void display(){
        System.out.println("Hello from interface A");
    }
}
class C extends B{
    public void show(){
        System.out.println("Hello from class C");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        C c1 = new C();
        c1.display();
        c1.show();
    }
}
