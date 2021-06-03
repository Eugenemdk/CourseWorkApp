package courseworkapp;

public class Sales {
private String firstname;
private String surname;
private String c_state;
private String city;
private String type_payment;
private String amount;
private String type_card;
private String type_money;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getC_state() {
	return c_state;
}
public void setC_state(String c_state) {
	this.c_state = c_state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getType_payment() {
	return type_payment;
}
public void setType_payment(String type_payment) {
	this.type_payment = type_payment;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getType_card() {
	return type_card;
}
public void setType_card(String type_card) {
	this.type_card = type_card;
}
public String getType_money() {
	return type_money;
}
public void setType_money(String type_money) {
	this.type_money = type_money;
}
public Sales(String firstname, String surname, String c_state, String city, String type_payment, String amount,
		String type_card, String type_money) {
	super();
	this.firstname = firstname;
	this.surname = surname;
	this.c_state = c_state;
	this.city = city;
	this.type_payment = type_payment;
	this.amount = amount;
	this.type_card = type_card;
	this.type_money = type_money;
}


}
