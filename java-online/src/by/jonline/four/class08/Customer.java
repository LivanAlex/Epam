package by.jonline.four.class08;

import static by.jonline.four.class08.CustomerLogic.*;

/*
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Определить конструкторы, set- и get- методы и метод toString().
 */

public class Customer {
	private static int counter = 0;
	private int id;
	private String surname;
	private String name;
	private String middleName;
	private String address;
	private long cardNum;
	private int bankAccountNumber;
	
	public Customer() {
		id = counter++;
		addClient(this);
	}
	
	public Customer(String surname, String name, String middleName, String address, long cardNum,
			int bankAccountNumber) {
		super();
		id = ++counter;
		this.surname = surname;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.cardNum = cardNum;
		this.bankAccountNumber = bankAccountNumber;
		addClient(this);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getCardNum() {
		return cardNum;
	}
	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", middleName=" + middleName
				+ ", address=" + address + ", cardNum=" + cardNum + ", bankAccountNumber=" + bankAccountNumber + "]";
	}
	
	
}
