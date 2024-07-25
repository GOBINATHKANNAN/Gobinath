import java.util.Scanner;

public class Caaaaa3 {
    public static void main(String[] args) {
        String n = getBrand();
        String m = getModel();
        Manage.Vehi2 vehicle =new Manage.Vehi2(n, m);
        vehicle.prt();
        vehicle.model();
    }

    public static String getBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the brand :");
        return sc.nextLine();
    }

    public static String getModel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the model :");
        return sc.nextLine();
    }
}