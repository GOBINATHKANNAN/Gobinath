import java.util.Scanner;

public class ReverseANum {
    public static void main(String[] args) {
        System.out.println("enter the num to reverse :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while(n >0)
        {
            int r=n%10;
             rev = (rev*10)+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
