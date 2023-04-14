// Create a class called BankAccount with attributes balance and interest_rate. Create two subclasses, CheckingAccount and SavingsAccount, that both inherit from BankAccount. Add an attribute transaction_fee to CheckingAccount and an attribute min_balance to SavingsAccount. Create a method in CheckingAccount called withdraw() that subtracts an amount from the balance and also subtracts the transaction fee. Create a method in SavingsAccount called add_interest() that adds interest to the balance.
 
class BankAccount{
  double balance=2000;
  double interest_rate;
  class CheckingAccount extends BankAccount{
    double transaction_fee=500;
    void withdraw(){
    double balance1=balance-transaction_fee;
    }
    class SavingsAccount extends Bankaccount{
      double min_balance=1000;
      void add_interest(){
        double balance=interest_rate+balance;
        System.out.println("total balance is"+balance);
      }
    }
    public class BankH{
      public static void main(String args[]){
        
      }
    }
  }
}