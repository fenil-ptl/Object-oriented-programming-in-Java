abstract class Animal
{ 
    Animal()
    {
        System.out.println(" Animal constructor");
    }
    public void eat()
    {
        System.out.println(" animal eats");
    }

    abstract void walk();
}
class Horse extends Animal
{
    Horse()
    {
        System.out.println(" Horse Constructor");
    }
    public void walk()
    {
        System.out.println("Walks on 4 legs ");
    }
}
class chicken extends Animal
{
    public void walk()
    {
        System.out.println("Walks on 2 legs ");
    }
}
public class ooopa {
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.walk();

    }
}
