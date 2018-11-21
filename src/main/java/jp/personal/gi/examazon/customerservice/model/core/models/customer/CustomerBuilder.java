package jp.personal.gi.examazon.customerservice.model.core.models.customer;

public final class CustomerBuilder {
	CustomerId id;
	CustomerName name;
	NameReading nameReading;
	RegistrationState registrationState;

	public CustomerBuilder withId(CustomerId id) {
		this.id = id;
		return this;
	}

	public CustomerBuilder withName(CustomerName name) {
		this.name = name;
		return this;
	}

	public CustomerBuilder withNameReading(NameReading nameReading) {
		this.nameReading = nameReading;
		return this;
	}

	public CustomerBuilder withRegistrationState(RegistrationState registrationState) {
		this.registrationState = registrationState;
		return this;
	}

	public Customer build() {
		return new Customer(id, name, nameReading, registrationState);
	}
}
