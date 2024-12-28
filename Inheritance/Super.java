class A{
    int l,b;
    A(){
        l=10;
        b=20;
    }
}
classs B extends A{
    int h;
    B(){
        super();
        h=30;
    }
    int volume(){
        return l*b*h;
    }
}
public class Super {
    B b1 = new B();
    int r = b1.volume();
    System.out.println(r);
}
