import java.util.Scanner;
public class DailyRoutines {
    public void getReminders(String name, String studies, String health, String sports)
    {
        System.out.println("reminders added by "+ name  +" for you !");
        System.out.println(studies);
        System.out.println(health);
        System.out.println(sports);
    }
    public void addReminder()
    {
        int select;
        String name ="",studies = "", health = "", sports = "";
        System.out.println("Add your reminder here !");
        Scanner input = new Scanner(System.in);
           System.out.println("Enter your name: ");
           name = input.nextLine();
           do {
               System.out.println("choose your reminder type :");
               System.out.println("1.Studies " + "\n" + "2.health " + "\n" + "3.Sports " + "\n");
               String rem = input.nextLine();
               switch (rem) {
                   case "1":
                       System.out.println("enter your reminder about Studies :");
                       studies = input.nextLine();
                       break;

                   case "2":
                       System.out.println("enter your reminder about Health :");
                       health = input.nextLine();
                       break;

                   case "3":
                       System.out.println("enter your reminder about Sports :");
                       sports = input.nextLine();
                       break;

                   default:
                       System.out.println("invalid choice !");

               }
               System.out.println("do you want to add another ? (1 for yes, 0 for no) :");
            select = input.nextInt();
            input.nextLine();
           }while(select==1);
           getReminders(name, studies, health, sports);
    }
    public void calc() {
        int num1,num2;
        String select;
        do{
            System.out.println("enter two numbers : ");
            Scanner i = new Scanner(System.in);
            num1 = i.nextInt();
            num2 = i.nextInt();
            System.out.println(" 1.Add" + "\t" + "2.Subtraction " + "\t" + "3.Multiplication" + "\t" + "4.Division" + "\t");
            int n = i.nextInt();
            switch (n) {
                case 1:
                    System.out.println("The sum of" + num1 + " + " + num2 + "is :" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("The difference of" + num1 + " + " + num2 + "is :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("The product of" + num1 + " + " + num2 + "is :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("The quotient of" + num1 + " + " + num2 + "is :" + (num1 / num2));
                    break;
                default:
                    System.out.println("invalid choice !");
            }
            System.out.println("Do you want to continue? ( type yes or no):");
            select = i.nextLine();
        }while(select.equals("yes"));

    }
    public void routines() {
        int choice,select;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Morning " + "\n" + "2.Afternoon" + "\n" + "3.Evening " + "\n" + "4.Night " + "\n" + "5.Sunday");
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        do{
            switch (choice) {
                case 1:
                    System.out.println("He wakes up at 6 o clock in the morning !");
                    break;
                case 2:
                    System.out.println("In Afternoon He goes to office ");
                    break;
                case 3:
                    System.out.println("In Evening He plays cricket and have some snacks ");
                    break;
                case 4:
                    System.out.println("In Night He goes to bed after 10 o clock ");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
            System.out.println("Do you want to continue? (1 for yes, 0 for no) :");
            select = sc.nextInt();
        }while(select ==1);
    }
    public void Todolist()
    {
            System.out.println(" these are the reminders !");
            System.out.println(" 1. JAVA class at 6.30 pm ");
            System.out.println(" 2. Need to Study some topics in  java string methods");
            System.out.println(" 3. make sure to complete the task given by Arun");
    }
    public void ExpenseCalculator()
    {
        float savings = 10000.00f;
        float money,expense;
        String value;
        System.out.println("1.Check saving amount "+"\n"+"2.Add amount"+"\n"+"3.Add expense ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        do{
            switch(choice) {
                case 1:
                    System.out.println("The savings amount is : "+"$"+savings);
                    break;
                case 2:
                    System.out.println("Enter the amount to be added  : ");
                    money = input.nextFloat();
                    System.out.println("The updated amount is : "+"$"+(money+savings));
                    break;
                case 3:
                    System.out.println("Enter the expense : ");
                    expense = input.nextFloat();
                    System.out.println("The updated amount is : "+"$"+(savings-expense));
                    break;
                default:
                    System.out.println("invalid choice !");
            }
            System.out.println("Do you want to continue? (yes or no) :");
            value = input.nextLine();
        }while(value.equals("yes"));



    }
    public static void main(String[] args) {
                  String select;
                 Scanner scanner = new Scanner(System.in);
                 DailyRoutines dailyRoutines = new DailyRoutines();
                System.out.println("Hello there ! Myself a personal assistant");
                do {
                    System.out.println("1.Add Reminder" + "\n" + "2.Calculator" + "\n" + "3.DailyRoutines" + "\n" + "4.To-do list" +"\n"+"5.Expense calculator");
                    System.out.println("Enter your choice : ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            dailyRoutines.addReminder();
                            break;
                        case 2:
                            dailyRoutines.calc();
                            break;
                        case 3:
                            dailyRoutines.routines();
                            break;
                        case 4:
                            dailyRoutines.Todolist();
                            break;
                        case 5:
                            dailyRoutines.ExpenseCalculator();
                            break;
                        default:
                            System.out.println("invalid choice !");
                    }
                    System.out.println("Do you want to continue? (yes or no):");
                    select = scanner.nextLine();
                }while(select.equals("yes"));
        }
}
