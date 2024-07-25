import java.util.Scanner;

public class Withoutfor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string : ");
            String s = sc.nextLine();
            System.out.println("The string is : "+s);
            char[] ch = sc.next().toCharArray();
            String w = String.valueOf(ch);
            System.out.println("The character is : "+w);
            System.out.println("the word " + w+ " is  found in th word "+ s +" : "+ s.contains(w));

        }
}
