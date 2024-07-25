package AnimalProject;

public class Animal {
    private String animal;
    protected String habitat;
    public int age;
    String diet;
    public Animal(String name, String habitat, int age, String diet) {
        this.animal = name;
        this.habitat = habitat;
        this.age = age;
        this.diet = diet;
    }

    public String getBrand() {
        return animal;
    }

    private void setBrand(String brand) {
        this.animal = brand;
    }

}
class Lion extends Animal{
        public Lion( String animal, String habitat,int age,String diet){
         super(animal,habitat,age,diet);

        }
    public void PrintDetails()
    {
        System.out.println("Animal :"+ getBrand());
        System.out.println("Habitat :" + habitat);
        System.out.println("Age :" + age);
        System.out.println("Diet :"+ diet);

    }
}
