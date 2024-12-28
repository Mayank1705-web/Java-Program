public class Sdemo4 {
    public static void main(String[] args) {
        String str = "Vanda Bharat is Indian Train";
        char[] c= str.toCharArray();
        for (int i=0; i<c.length; i++){
            if (c[i] == ' ')
                System.out.println();
            else{
                System.out.print(c[i]);
            }
    
        }
    }
}
