class A{
    int i=10, j=20;
    int area(){
        return i*j;
    }
}
public class demo3 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println("Area: "+a1.area());
    }
}
