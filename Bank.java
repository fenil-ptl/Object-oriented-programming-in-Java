package bank;
class Account
{
   public String name;
   private String password;
   String balance;
   public String  getpassword()
   {
        return this.password;
   }
   public void setpassword()
   {
        this.password= pass;
   }
}
public class Bank {
    public static void main(String args[])
    {
        Account a2 = new Account();
        a2.name=" paisa hi paisa ";
         a2.setpassword("zero");
        System.out.println(a2.getpassword());
    }
}
