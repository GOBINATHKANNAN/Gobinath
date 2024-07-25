public class Vehicl2 {
    private String brand ;
    private Vehicl2(String brand) {
        this.brand = brand;
    }
//    public Vehicle() {
//    }
    public void model() {
        System.out.println("model is i10");
    }
    public void printbrd() {
    System.out.println("brand is " + brand);
}

public static void brand(String brand){
        Vehicl2 ve=new Vehicl2(brand);
        ve.printbrd();
        ve.model();
    }
}
