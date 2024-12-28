public class Value {
        private byte b;
        private short s;
        private int i;
        private long l;
        private double d;
        private char c;
        private boolean bb;
    public void showValue(){
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + bb);
    }
}
class defaultValue{
    public static void main(String[] args){
        Value v = new Value();
        v.showValue();
    }
}
