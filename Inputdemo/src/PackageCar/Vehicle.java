package PackageCar;

public class Vehicle {
    private String brand;
    protected int year;
    public String model;
    int speed;

    public  String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand, int year, String model, int speed) {
        this.brand=brand;
        this.year=year;
        this.model=model;
        this.speed=speed;
    }

    private void startEngine()
    {
        System.out.println("Engine started");
    }
    protected void accelerate()
    {
        System.out.println("Accelerating");
    }
    public void stop()
    {
        System.out.println("Vehicle stopped");
    }
    void currentSpeed()
    {
        System.out.println(speed);
    }
    public void vehicle()
    {

    }

}
