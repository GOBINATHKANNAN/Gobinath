package PackageCar;

public class Car extends Vehicle {

    public Car(String brand, int year, String model, int speed)
   {
       super(brand, year, model, speed);
   }
   public void PrintDetails()
   {
       System.out.println("brand :"+ getBrand());
       System.out.println("year :" + year);
       System.out.println("Model :" + model);
       System.out.println("Speed :"+ speed);
       accelerate();
       stop();
       currentSpeed();
   }


}
