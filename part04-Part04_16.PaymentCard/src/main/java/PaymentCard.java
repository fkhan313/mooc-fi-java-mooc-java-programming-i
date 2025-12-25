public class PaymentCard {

  private double balance;

  public PaymentCard(double openingBalance) {
    // write code here
    this.balance = openingBalance;
  }

  public void eatAffordably() {
    // write code here

    if (this.balance >= 2.60) {
      this.balance -= 2.60;
    }

  }

  public void eatHeartily() {
    // write code here
    if (this.balance >= 4.60) {
      this.balance -= 4.60;
    }
  }

  /*
   * public void addMoney(double amount) {
   * // write code here
   * double newBalance = 0;
   * if (amount < 0) {
   * newBalance = this.balance + 0;
   * } else {
   * newBalance = this.balance + amount;
   * }
   * 
   * if (newBalance > 150.00) {
   * this.balance = 150.00;
   * } else {
   * this.balance = newBalance;
   * }
   * }
   */

  public void addMoney(double amount) {
    if (amount < 0) {
      return;
    }

    this.balance += amount;

    if (this.balance > 150.00) {
      this.balance = 150.00;
    }
  }

  public String toString() {
    // write code here
    return "The card has a balance of " + balance + " euros";
  }

}
