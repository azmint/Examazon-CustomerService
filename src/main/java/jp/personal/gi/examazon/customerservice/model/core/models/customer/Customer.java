package jp.personal.gi.examazon.customerservice.model.core.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.support.entity.Entity;

import java.util.Objects;

public class Customer implements Entity<CustomerId> {
	final CustomerId id;
	final CustomerName name;
	final NameReading nameReading;
	final RegistrationState registrationState;

	public Customer(CustomerId id, CustomerName name, NameReading nameReading, RegistrationState registrationState) {
		this.id = id;
		this.name = name;
		this.nameReading = nameReading;
		this.registrationState = registrationState;
	}

	public CustomerName name() {
		return name;
	}

	public NameReading nameReading() {
		return nameReading;
	}

	public RegistrationState registrationState() {
		return registrationState;
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
			   ", nameReading=" + nameReading +
			   ", registrationState=" + registrationState +
			   '}';
	}
}
