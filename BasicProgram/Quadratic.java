import java.util.Scanner;
class Root{
    private double r1, r2;
    void showRoots(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first coefficient: ");
        int a = sc.nextInt();
        System.out.println("Enter the second coefficient: ");
        int b = sc.nextInt();
        System.out.println("Enter the third coefficient: ");
        int c = sc.nextInt();
        double dis = b*b-(4*a*c);
        if(dis > 0){
            r1 = (-b + Math.sqrt(dis))/(2*a);
            r2 = (-b - Math.sqrt(dis))/(2*a);
            System.out.println("Roots are real and distinct: " + r1 + " and " + r2);
        }else{
            System.out.println("Roots are complex number");
        }
    }
}
public class Quadratic {
    public static void main(String[] args){
        Root obj = new Root();
        obj.showRoots();
    }    
}
