package homework001.exercises.account;
public class Account {
    private String id ;
    private String name; 
    private int balance; 

    public Account(){}

    public Account(String id, String name){
        this.id = id; 
        this.name = name;
    }

    public Account(String id, String name , int balance){
        this.id = id; 
        this.name = name;
        this.balance = balance;
    }

    public String getId (){
        return id; 
    }

    public String getName(){
        return name ; 
    }

    public int getBalance(){
        return balance;
    }

    public int Credit (int Amount){
        balance = balance + Amount;
        return balance; 
    }

    public int Debit (int Amount){
        if (Amount <= balance){
            balance = balance - Amount;
        }
        else {
            System.out.println("Amount exceeds balance");
        }
        return balance; 
    }

    @Override
    public String toString (){
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}