class A{
    void show(){
        System.out.println("This is Show from A");
    }
}
class B extends A{
    void display(){
        System.out.println("This is Display from B");
    }
}
class Main{
    public static void main(String[] args) {
        B b1=new B();
        b1.show();
        b1.display();
    }
}