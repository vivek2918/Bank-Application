import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //bank is initializing
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
       balance += amount;
       return "If you seen your balance" + balance;
    }

    @Override
    public String withdrawMonet(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return"Sorry ! Insufficient Money";
            }
            else{
                balance = balance - amount;
                return "paisa !! paisa";
            }
        }
        else{
            return "Wrong password";
        }
    }

    @Override
    public Double calculateInterest(int year) {
        return (balance*year+rateOfInterest)/100;
    }
}
