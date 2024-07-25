import java.util.Scanner;

public class SumOfEven {

   public static void main(String[] args) throws Exception {
        int sum=0,s,e;
        Scanner sc = new Scanner(System.in);System.out.println("Enter the starting number :");
       s = sc.nextInt();
        System.out.println("Enter the ending number :");
        e = sc.nextInt();
        sc.nextLine();

    for(int i=s;i<e;i++){
        if(i< e){
            throw new Exception("i is less than e");
        }
        if(i%2==0)
        {
            sum+=i;
        }
    }
    System.out.println("The sum of even numbers is : "+sum);
    }
}
