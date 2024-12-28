class A{
    int a, b;
    A(){
        a = 10;
        b = 20;
    }
    A(int i, int j){
        a = i;
        b = j;
    }
    int area(){
        return a*b;
    }
}
public class demo7 {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A(30, 40);
        System.out.println("Area of first object: " + a1.area());
        System.out.println("Area of second object: " + a2.area());
    }
}
