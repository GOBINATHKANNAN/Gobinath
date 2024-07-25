import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        switch (month) {
            case "January":
                System.out.println("31 days in this month!");
                break;
            case "February":
                System.out.println("28 days in this month!");
                break;
            case "March":
                System.out.println("31 days in this month!");
                break;
            case "April":
                System.out.println("30 days in this month!");
                break;
            case "May":
                System.out.println("31 days in this month!");
                break;
            case "June":
                System.out.println("30 days in this month!");
                break;
            case "July":
                System.out.println("31 days in this month!");
                break;
            case "August":
                System.out.println("31 days in this month!");
                break;
            case "September":
                System.out.println("30 days in this month!");
                break;
            case "October":
                System.out.println("31 days in this month!");
                break;
            case "November":
                System.out.println("30 days in this month!");
                break;
            case "December":
                System.out.println("31 days in this month!");
                break;
            default:
                System.out.println("Invalid month!");
        }
    }
}
