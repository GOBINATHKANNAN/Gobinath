import java.util.Scanner;

public class CheckingVowels {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String original = s.toLowerCase();
        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        String vowels = String.valueOf(vow);
        int count = 0;
        int num =0;
        System.out.print( "the vowels are :");
        for (int i = 0; i < original.length(); i++) {
            if (vowels.contains(String.valueOf(original.charAt(i))))
            {
                System.out.print( original.charAt(i) +"\t");
                count ++;
            }
        }
        System.out.println("\n");
        System.out.println("The number of vowels is : "+count);
        System.out.print("the constants are :");
        for (int i = 0; i < original.length(); i++) {
            if (!(vowels.contains(String.valueOf(original.charAt(i))))) {
                System.out.print( original.charAt(i) + "\t");
                num++;
            }
        }
        System.out.println("\n");
        System.out.println("The number of constants is : "+num);

    }
}
