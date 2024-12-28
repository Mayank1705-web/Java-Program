interface A{
    void display();
}
interface  B{
    void show();
}
class C implements A,B{
    public void display() {
        System.out.println("This is Display from C");
    }
    public void show() {
        System.out.println("This is Show from C");
    }
}
public class interfaceDemo4 {
    public static void main(String[] args){
        C c1 = new C();
        c1.display();
        c1.show();
    }
}
