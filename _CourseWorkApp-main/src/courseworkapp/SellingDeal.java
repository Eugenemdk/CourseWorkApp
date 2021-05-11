package courseworkapp;

public class SellingDeal {
private String name;
private String surname;
private String estate;
private String city;
private String typeOfPayment;
private String amount;
private String typeOfCard;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getEstate() {
	return estate;
}
public void setEstate(String estate) {
	this.estate = estate;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getTypeOfPayment() {
	return typeOfPayment;
}
public void setTypeOfPayment(String typeOfPayment) {
	this.typeOfPayment = typeOfPayment;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getTypeOfCard() {
	return typeOfCard;
}
public void setTypeOfCard(String typeOfCard) {
	this.typeOfCard = typeOfCard;
}
public SellingDeal(String name, String surname, String estate, String city, String typeOfPayment, String amount,
		String typeOfCard) {
	super();
	this.name = name;
	this.surname = surname;
	this.estate = estate;
	this.city = city;
	this.typeOfPayment = typeOfPayment;
	this.amount = amount;
	this.typeOfCard = typeOfCard;
}

}
