package courseworkapp;

public class SavingsAccountInfo {
private String accountRate;
private String amount;
private String rate;
public String getAccountRate() {
	return accountRate;
}
public void setAccountRate(String accountRate) {
	this.accountRate = accountRate;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public SavingsAccountInfo(String accountRate, String amount, String rate) {
	super();
	this.accountRate = accountRate;
	this.amount = amount;
	this.rate = rate;
}

}
