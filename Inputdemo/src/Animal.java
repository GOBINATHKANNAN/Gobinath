class Animal  {
    public void animalsound() {
        System.out.println("Animal and their sounds !");
    }
}
class Dog extends Animal
{
    public void animalsound(String name ){
        System.out.println("dog barks" );
    }
}
class Cat extends Animal
{
    public void animalsound(){
        System.out.println("cat meows");
    }
}

