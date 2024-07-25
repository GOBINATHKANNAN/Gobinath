import java.util.Scanner;
public class MaxThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("the elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + "\t");
        }
        int temp = 0;
        System.out.println("\n");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {

                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            int x = numbers[i];
        }
        for (int x = 0; x < 3; x++) {
            System.out.println(numbers[x]);
        }


    }
}
