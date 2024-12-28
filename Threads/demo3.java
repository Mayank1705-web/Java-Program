class A extends  Thread{
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println("Good Morning");
                sleep (1000);
            }
        } catch (InterruptedException e) {
            System.out.print(e);
        }
    }
}
class B extends  Thread{
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println("Hello");
                sleep (2000);
            }
        } catch (InterruptedException e) {
            System.out.print(e);
        }
    }
}
class C extends  Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Welcome");
                sleep (3000);
            }
        } catch (InterruptedException e) {
            System.out.print(e);
        }
    }
}
public class demo3 {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
        try {
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            System.out.print(e);
        }
        System.out.println("Thread A is "+ a.isAlive());
        System.out.println("Thread B is "+ b.isAlive());
        System.out.println("Thread C is "+ c.isAlive());
    }
}
