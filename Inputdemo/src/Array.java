import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];
        System.out.println("enter the elements :");
        for(int i=0;i<n;i++)
        {
           array[i]= scanner.nextLine();
        }
        System.out.println("enter the symbol :");
        String sym = scanner.nextLine();
        System.out.println("the array elements are :");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("the symbol is :" + sym);
        System.out.println("after joining two strings :-");
        String res = joiningtwo( array , sym );
        System.out.println(res);
        scanner.close();
    }
    public static String joiningtwo(String[] arr, String s)
    {
        StringBuilder my= new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            my.append(arr[i]);
            if(i<arr.length-1) {
                my.append(s);
            }
        }
        return my.toString();
    }
     /* Total myc = new Car();
        Total myb = new Bike();
        Sound m = new Sound();
        m.chooseveh(myc);
        m.chooseveh(myb); */


//        int x=5;
//        boolean b=true;
//        String s1 = Boolean.toString(b);
//        System.out.println(s1);
//        String s2 = String.valueOf(x);
//        System.out.println(x);
//Carr car = new Carr();
//    String brand =car.Getbrand();
//        System.out.println("the brand is : " + brand);
}
