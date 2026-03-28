package DAY_8.VsCode;
class BankBalance{
    double balance;
    int withdrawal;aq
    int accountNumber;
    BankBalance(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void balance(){
        System.out.println("Your Current Balance : "+balance);
    }
    void withdrawal(int withdrawal){
        if(withdrawal>0&&withdrawal<=balance){
            balance=balance-withdrawal;
            System.out.println("Amount withdrawed successfully!");
            balance();
        }
        else{
            System.out.println("Insufficient Balance");
            balance();
        }
    }
    void deposit(int amount){
        if(amount>0){
          balance=balance+amount;
          balance();
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}
public class Account {
    public static void main(String[] args) {
        BankBalance b=new BankBalance(12345678,100);
        b.withdrawal(101);
        b.deposit(200);
    }
}
