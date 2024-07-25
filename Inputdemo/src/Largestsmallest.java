import java.util.Scanner;

public class Largestsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the array elements are :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
        int max = arr[0],min = arr[0];
        for(int i=0;i< arr.length;i++) {
            if ( max < arr[i] ) {
                max = arr[i];
            }
        }
        System.out.println("the max num in array is : "+ max);
        for(int i=0;i< arr.length;i++) {
            if ( min > arr[i] ) {
                min = arr[i];
            }
        }
        System.out.println("the max num in array is : "+ min);

    }
}
