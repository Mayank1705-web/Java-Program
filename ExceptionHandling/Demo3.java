public class Demo3 {
    public static void main(String[] args) {
        int a,b;
        try {
            a=10;
            b=0;
            int c=a/b;
            System.out.println("Result: "+c);
        }  finally {
            System.out.println("This will always run.");
        }
    }    
}
