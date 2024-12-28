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
class C extends B{
        void output(){
            System.out.println ("Hello from C");
        }
}
class MultiLevel{
    public static  void main(String[] args){
        C c1 = new C();
        c1.show();
        c1.display();
        c1.output();
    }
}