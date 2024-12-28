public class Demo2 {
    public static void main(String[] args) {
        int a, b, c;
        int[] d = {1,2,3,4,5};
        try {
            a = 10;
            b = 10;
            c = a / b;
            System.out.println("Result: " + c);
            System.out.println(d[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception occurred: " + e.getMessage());
        }

    }    
}
