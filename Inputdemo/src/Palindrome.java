import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter the string :");
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        String orig = o.toLowerCase();
        String orignal = orig.replaceAll(" ","");

        System.out.println("the original string is :");
        for (int i = 0; i < orignal.length(); i++) {
            System.out.print(orignal.charAt(i));
        }
        String reverse = "";
        System.out.println("\n");
        for (int i =orignal.length()-1; i >=0; i--) {
            reverse=reverse+orignal.charAt(i);
        }
        System.out.println("the reversed string is "+reverse);
        int count=0;
        for (int i = 0; i < orignal.length(); i++)
            if (orignal.charAt(i) != reverse.charAt(i)) {
                count++;
            }
        if(count==0)
        {
            System.out.println(orignal+" is a  palindrome");
        }
        else {
            System.out.println(orignal+" is not a  palindrome");
        }
    }
}
