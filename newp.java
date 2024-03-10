import java.util.*;
public class newp
{
    public static void main(String []args)
    {
        
        Scannesxxxxxxxxxxxxxxxxxxxxxxxxxxddo.ptr scanner = new Scanner(System.in);
        int u;
        do{
            System.out.println("Enter Initial velocity :=");
            u= scanner.nextInt();
        }while(u<0);

        System.out.println("Enter Time :=");
        int t=scanner.nextInt();

        System.out.println(" Enter Accelaration =");
        int a=scanner.nextInt();

        double d = (u*t)+(0.5*a*Math.pow(t, 2));
        System.out.println(" Distance = " +d);
        
    }
}