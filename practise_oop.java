class Family
{
    String member;
    String name;

    public void tree()
    {
        System.out.println(" Patel Family");
        System.out.println(this.member);
        System.out.println(this.name);
    }
}
 // #  this is call the single level inheritance [ in between triangle class and shape class ]
class Triangle
{
    public void area()
    {
        System.out.println(" Display area : ");
    }
}
class Shape extends Triangle  
{
    public void area(int l , int h)
    {
        System.out.println(0.5*l*h);
    }
}

// this is call multi level inheritance from   triangle class >> shape class >> circle class
class Triangle
{
    public void area()
    {
        System.out.println(" Display area : ");
    }
}
class Shape extends Triangle  
{
    public void area(int l , int h)
    {
        System.out.println(0.5*l*h);
    }
}
class circle extends Shape
{
    public void area()
    {
        System.out.println(" hii kal oop ma TEP he  ! that's fun  ");
    }
}
public class practise_oop 
{
    public static void main(String[] args) 
    {
        Family f1=new Family();
        f1.name="Fenil";
        f1.member="Engineer";

        f1.tree();
         
    }
   
}
 