package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity.Entity;

import java.util.Objects;

public class Customer implements Entity<CustomerId> {
	final CustomerId id;
	final CustomerName name;
	final MailAdress mailAdress;
	final PhoneNumber phoneNumber;
	final Password password;

	public Customer(CustomerId id, CustomerName name, MailAdress mailAdress, PhoneNumber phoneNumber, Password password) {
		this.id = id;
		this.name = name;
		this.mailAdress = mailAdress;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}

	@Override
	public CustomerId id() {
		return id;
	}

	@Override
	public boolean matches(CustomerId id) {
		return Objects.equals(id, this.id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Customer)) return false;
		Customer customer = (Customer) o;
		return Objects.equals(id, customer.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Customer{" +
			   "id=" + id +
			   ", name=" + name +
			   ", mailAdress=" + mailAdress +
			   ", phoneNumber=" + phoneNumber +
			   ", password=" + password +
			   '}';
	}
}
