public class Sdemo7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        sb.replace(1, 2 , "'Java'");
        System.out.println(sb);
    }    
}
