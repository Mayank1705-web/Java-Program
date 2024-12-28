class A{
    int a,b;
    A(){
        a = 10;
        b = 20;
    }
    int area(){
        return a*b;
    }
}
public class demo5 {
    public static void main (String[] args){
        A obj = new A();
        System.out.println("Area: " + obj.area());
    }
}
