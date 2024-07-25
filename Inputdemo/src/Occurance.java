import java.util.Scanner;

public class Occurance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = "aeffff";
        int[] asciiArray = new int[200];
        for(char character :str.toCharArray())
        {
            asciiArray[(int) character]++;
        }
        for(int i=0;i< asciiArray.length;i++)
        {
            if(asciiArray[i]>0)
            {
                System.out.println((char)i + " - " + asciiArray[i]);
            }
        }
    }
}

