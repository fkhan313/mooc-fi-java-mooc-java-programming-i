
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account acct1 = new Account("Matthews account", 1000);
        Account acct2 = new Account("My account", 0);
        acct1.withdrawal(100.0);
        acct2.deposit(100.0);
        System.out.println(acct1);
        System.out.println(acct2);
    }
}
