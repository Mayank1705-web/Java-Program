class A implements Runnable {
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(i+" Good Morning");
                Thread.sleep (1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class B implements Runnable {
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(i+" Hello");
                Thread.sleep (2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class C implements Runnable {
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(i+" Java");
                Thread.sleep (3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class demo2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }
}
