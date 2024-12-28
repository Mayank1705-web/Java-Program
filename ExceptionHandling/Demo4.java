class Demo4 {
    public static void main(String[] args) {
        int a,b,c;
        char ch ='a';
        int[] d= {1,2,3,4,5};
        String str = new String("Hello");
        Integer intRef;
        intRef = null;
        try {
            try {
                a=10;
                b=0;
                c=a/b;
                System.out.println("Result: "+c);
            } catch (ArithmeticException e) {
                System.out.println("Error: "+e.getMessage());
            } try {
                int e = ch;
                System.out.println("Result: "+ch);
            } catch (NumberFormatException e) {
            } try {
                System.out.println(d[6]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: "+e.getMessage());
            } try {
                System.out.println(str.charAt(6));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: "+e.getMessage());
            } try {
                System.out.println(intRef.toString());
            } catch (NullPointerException e) {
                System.out.println("Error: "+e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }    
}
