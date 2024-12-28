class A{
    int area(int x, int y){
        return x*y;
    }
}
public class demo4 {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.area(10, 5));
    }
}
