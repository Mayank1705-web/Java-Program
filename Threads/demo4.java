class A extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread A is running");
                sleep (1000);
            }
        } catch (InterruptedException e) {
        }
    }
}
class B extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread B is running");
                sleep (2000);
            }
        } catch (InterruptedException e) {
        }
    }
}
class C extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread C is running");
                sleep (3000);
            }
        } catch (InterruptedException e) {
        }
    }
}
public class demo4 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();  
        C c = new C();
        a.setDaemon(true);
        a.start();
        b.start();
        c.start();
    }
}
