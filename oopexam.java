import java.util.Arrays;
import java.util.Scanner;
public class oopexam
{
    public static void main(String args[])
    {
        Scanner scanner =  new Scanner(System.in);
        int [][]a2=new int[][]{{23,45},{24,67}};
        int []a1=new int[]{23,45,67,86,44};
        final float pi=3.14F;
        int a =9;
        int b =3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        a+=b;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.deepToString(a2));
        System.out.println(pi);
        System.out.println("Enter First name =");
        String fname=scanner.next();
        System.out.println(fname);
        System.out.println("Enter Full name =");
        String name = scanner.nextLine();
        System.out.println(name);
       
        System.out.println("Enter your Age :=");
        int age = scanner.nextInt();
        System.out.println("Your age =" +age);

    }
}