import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        String w = word.toLowerCase();
        for (int i = 0; i < w.length()-1; i++) {
            if(w.charAt(i)== w.charAt(i+1))
            {
                System.out.println("the repeated letters is :" + w.charAt(i));
            }

        }

    }
}
