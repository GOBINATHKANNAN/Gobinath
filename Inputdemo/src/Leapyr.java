import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a year : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if( (n % 4 == 0 && n% 100!= 0 ) || n % 400 == 0 ) {
            System.out.println("The year "+ n +" is a Leap Year");
        }
        else {
            System.out.println("The year "+ n +" is not a Leap Year");
        }
    }
}
