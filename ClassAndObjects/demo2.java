class A{
    void display(int x, int y){
        System.out.println(x+"\n"+y);
    }
}
public class demo2 {
    public static void main(String []args){
        A obj = new A();
        obj.display(5, 10);
    }
}
