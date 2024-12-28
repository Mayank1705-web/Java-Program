public class Sdemo3 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str);
        System.out.println("Get a sub-string from index 3:" + str.substring(3));
        char[] c= str.toCharArray();
        for (int i=0; i<c.length; i++){
            System.out.println("Character at index " + i + ": " + c[i]);
        }
    }    
}
