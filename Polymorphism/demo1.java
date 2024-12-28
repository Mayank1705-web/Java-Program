class A{
    void display(){
        System.out.println("Display from A");
    }
}
class B extends A{
    void display(){
        System.out.println("Display from B");
    }
}
class C extends A{
    void display(){
        System.out.println("Display from C");
    }
}
class demo1{
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        A ref;
        ref = a1;
        ref.display();
        ref = b1;
        ref.display();
        ref = c1;
        ref.display();
    }
}