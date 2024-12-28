class A{
    int a, b;
    A(int i, int j){
        a = i;
        b = j;
    }
    int area(){
        return a*b;
    }
}
public class demo6 {
    public static void main(String[] args){
        A obj = new A(5, 10);
        System.out.println("Area: " + obj.area());
    }
}
