public class Demo1 {
    public static void main(String[] args) {
        int a=10, b=0;
        try {
            int c = a/b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    } 
}
