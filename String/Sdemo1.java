import java.util.Scanner;
public class Sdemo1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str1 = "Hello";
        String str2 = new String();
        System.out.print("Enter a string: ");
        str2 = s.nextLine();
        String str3 = str1 + " " + str2;
        System.out.println(str3); 
        System.out.println(str1.concat(" ").concat(str2));
    }    
}
