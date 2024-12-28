class A{
    public void show(){
        System.out.println ("Hello from A");
    }
}
class B extends A{
    void display(){
        System.out.println ("Hello from B");
    }
}
class C extends A{
        void output(){
            System.out.println ("Hello from C");
        }
}
class HierarchicalInheritance{
    public static void main(String[] args){
        B b1 = new B();
        C c1 = new C();
        b1.show();
        c1.show();
        b1.display();
        c1.output();
    }
}