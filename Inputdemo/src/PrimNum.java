import java.util.Scanner;

public class PrimNum {
    public static void main(String[] args) {
        int n,count=0;
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==0 || n==1)
        {
            System.out.println(n+" is not  a Prime number");
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(n+" is  a Prime number");
        }
        else {
            System.out.println(n+" is not a Prime number");
        }
    }
}
