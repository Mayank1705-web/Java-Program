class A{
    int a = 10, b = 20;
    int area(){
        return a*b;
    }
    int arear(int l, int b){
        return l*b;
    }
}
public class demo8 {
    public static void main(String[] args){
        A obj = new A();
        System.out.println("Area of rectangle: " + obj.area());
        System.out.println("Area of rectangle with length 5 and breadth 10: " + obj.arear(5,10));
    }
}
