public class primaryNumber {
    public static void main(String[] args) {
        int flag = 0, num = 4,i;
        for (i = 1; i <= num/2; i++) {
            if(num%i == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print(num+"is a prime number");
        }
        else{
            System.out.print(num+"is not a prime number");
        }
    }
}
