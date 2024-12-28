class A extends Thread{
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(i+" Good Morning");
                sleep (1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class B extends Thread{
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(i+" Hello");
                sleep (2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class C extends Thread{
    public void run(){
        try {
            for (int i = 0; i <=10; i++){
                System.out.println(i+" Welcome");
                sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class demo1 {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();

    }
}
