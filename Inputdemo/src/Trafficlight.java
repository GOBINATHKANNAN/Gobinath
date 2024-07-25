import java.util.Scanner;

public class Trafficlight {
    public static void signal1(int signalnum)
    {
        int n=signalnum,count=0;
        System.out.println("signal "+ signalnum+" :");
            System.out.println("RED! ,Stop");
//            for(int i=0;i<=20;i++)
//            {
//                System.out.println(i);
//            }
            System.out.println("Yellow! ,Get ready");
//            for(int i=0;i<=10;i++)
//            {
//                System.out.println(i);
//            }
            int number = 1 + (int)(20 * Math.random());
            System.out.println("Number of vehicles crossed during yellow signal in signal "+signalnum+" is :"+ number);
            System.out.println("Green ! , Go");
        number = 1 + (int)(100 * Math.random());
            for(int i=0;i<=number;i++)
            {

               count++;
            }
             System.out.println("Number of vehicles crossed during green signal in signal "+signalnum+" is :"+ count);
            System.out.println("Signal "+signalnum+" is turned into RED.");
            n++;
        System.out.println("signal "+((n -1) % 4 +1) +" is turned into GREEN !");
    }
//public static void signal1(int signalnum)
//        {
//        int num ,m,count=0, n=signalnum;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("signal "+ signalnum+" :");
//            System.out.println("RED! ,Stop");
//            for(int i=0;i<=25;i++)
//            {
//                System.out.println(i);
//            }
//            System.out.println("Yellow! ,Get ready");
//            for(int i=0;i<=10;i++)
//            {
//                System.out.println(i);
//            }
//            System.out.println("Green ! , Go");
////            long startTime = System.currentTimeMillis();
////            long endTime = startTime + 5000; // 10 seconds
////            while (System.currentTimeMillis() < endTime) {
////                if (sc.hasNextInt()) {
////                    sc.nextInt();
////                    count++;
////                }
////            }
////            for(int i=1;i<=5;i++)
////            {
////                for(int j =1;j<=3;j++)
////                {
////                    num = sc.nextInt();
////                    count++;
////                }
////            }
//            System.out.println("Number of vehicles crossed during green signal in signal "+signalnum+" is :"+ count);
//            System.out.println("Signal "+signalnum+" is turned into RED.");
//            n++;
//        System.out.println("signal "+((n -1) % 4 +1) +" is turned into GREEN !");
//    }
     public static void main(String[] args) {
         System.out.println("traffic light !");
         System.out.println("enter the number of cycles :");
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             signal1((i - 1) % 4 + 1);
         }
    }
}
