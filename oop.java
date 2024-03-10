import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthStyleFactory;
import bank;
class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println(" Writing omething");
    }
    
    public void printcolor()
    {
        System.out.println(this.color);
    }
    public void printtype()
    {
        System.out.println(this.type);
    }

}
/* 
class Student
{
    int age;
    String name;

    public void printinfo() // function or a method of a student class
    {
        System.out.println(this.name);
        System.out.println(age);
    }
   
    Student(String name, int age) //parameter constructor
    {
        this.name=name; // this.name = object , name;= parameter
        this.age=age; // 
    } 

    // #---------------------Polymorphism----------------------//#endregion
    public void printinfo(int age)
    {
        System.out.println(age);
    }
    public void printinfo(String name)
    {
        System.out.println(name);
    }
    public void printinfo(int age, String name)
    {
        System.out.println(name+" " +age);
    }
}
abstract class Animal 
{
    abstract void walk();
}
class Horse extends Animal
{   
    public static void main()
    {
        System.out.println(" Walks on 4 legs");
    }
}
class chicken extends Animal{
    public void walk()
    {
        System.out.println("Walks on 2 legs");
    }
}
class Shape // base class
{
    String color;
}
class Triangle extends Shape  // inheritance  , triangle is a sub class or a derive class of shape
{
    // shape  / triangle == single level inheritance
    // shape / triangle / rectangle ==multi level inheritance
    //shape / triangle / circle / rectangle /cube /,....still going = hybrid inheritance
    //  [  shape /  circle   , shape / square  ]=hierarchial inheritance
}
public class oop {
    public static void main(String args[])
    {

        Pen pen1 = new Pen(); // creating  object 
        pen1.color= "blue"; // using it's property
        pen1.type="gel"; // property 

       Pen pen2=new Pen(); // 2nd object of pen class
       pen2.color="Red";
       pen2.type="ballpoint";

       pen1.printcolor(); 
       pen2.printcolor();
       
       pen1.printtype();
       pen2.printtype();

       Student s1=new Student("Fenil",20);
       Triangle t1=new Triangle();
       t1.color="green";
       
        bank.Account a1=new Account();
        a1.String =" Fenil";
        hor
        //  Access modifirer
        /*  types
            1 . public 
            2. private
            3. default 
            4. protected 

         * 
         * protected things can use and call with the help of getters and setters 
         *
         */
      
       /* 
       s1.printinfo();
       Horse horse=new Horse();
       horse.walk();
       
    }
}