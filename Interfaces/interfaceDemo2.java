interface A{
    public void dispaly();
}
interface B extends A{
    public void show();
}
class C{
    public void output(){
        System.out.println("This is output from C");
    }
}
class D extends C implements B{
    public void dispaly(){
        System.out.println("This is dispaly from A");
    }
    public void show(){
        System.out.println("This is show from B");
    }
}
class E extends D{
    public void out(){
        System.out.println("This is output from C");
    }
}
public class interfaceDemo2 {
    public static void main(String[] args){
        E e1 = new E();
        e1.dispaly();
        e1.show();
        e1.output();
        e1.out();
    }
}
