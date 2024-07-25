import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the mark of the student : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
                if(n>=90 && n<=100)
                {
                    System.out.println("Grade is A");
                }
                else if(n>=80 && n<=89)
                {
                    System.out.println("Grade is B");
                }
                else if(n>=70 && n<=79)
                {
                    System.out.println("Grade is C");
                }
                else if(n>=60 && n<=69)
                {
                    System.out.println("Grade is D");
                }
                else {
                    System.out.println("Grade is E");
                }
    }
}
