
interface Total {
     void vehiclesound();

}
class Car1 implements Total
{
    public void vehiclesound(){
        System.out.println("car is faster");
    }
}
class Bike implements Total
{
    public void vehiclesound(){
        System.out.println("bike is elegance");
    }
}
class  Sound{
  public void chooseveh(Total sso) {
       sso.vehiclesound();
 }
}


