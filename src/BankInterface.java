public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMonet(int amount, String password);
    Double calculateInterest(int year);
}
