import java.util.Scanner;
abstract class bank
   {
    static Scanner sc = new Scanner(System.in);
    double balance=80000;
    abstract void payment(double amt);
    }
class Paytm extends bank
   {
     void payment(double amt)
     {
       if(amt<=balance)
       {
        balance = balance-amt;
         if(amt>2000)
          {
            System.out.println("You got 50RS Cash back");
            balance = balance+50;
           }
        }
       else
        {
        System.out.println("INSUFFICIENT BALANCE");
         }
         System.out.println("Balance:" +balance);
      }
   }
class Gpay extends bank
   {
     void payment(double amt)
     {
       if(amt<=balance)
       {
        balance = balance-amt;
          if(amt>5000)
           {
            System.out.println("You got a scratch card");
            }
        }
       else
        {
        System.out.println("INSUFFICIENT BALANCE");
         }
         System.out.println("Balance:" +balance);
      }
   }
class Phonepe extends bank
   {
     void payment(double amt)
     {
       if(amt<=balance)
       {
        balance = balance-amt;
        }
       else
        {
        System.out.println("INSUFFICIENT BALANCE");
         }
         System.out.println("Balance:" +balance);
      }
   }
class user
   {
     public static void main(String[] args)
     {
       System.out.println("1.paytm\n2.gpay\n3.phonepe");
        int n=bank.sc.nextInt();
      if(n==1){
        System.out.println("Enter the amount");
         Paytm acc = new Paytm();
         acc.payment(bank.sc.nextDouble());
        }
       if(n==2){
        System.out.println("Enter the amount");
         Gpay acc = new Gpay();
         acc.payment(bank.sc.nextDouble());
        }
       if(n==3){
        System.out.println("Enter the amount");
         Phonepe acc = new Phonepe();
         acc.payment(bank.sc.nextDouble());
        }
    }
}
