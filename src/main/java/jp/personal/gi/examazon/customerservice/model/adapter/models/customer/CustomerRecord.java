package jp.personal.gi.examazon.customerservice.model.adapter.models.customer;

public class CustomerRecord {
	String id;
	String name;
	String nameReading;
	int registrationState;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameReading() {
		return nameReading;
	}

	public void setNameReading(String nameReading) {
		this.nameReading = nameReading;
	}

	public int getRegistrationState() {
		return registrationState;
	}

	public void setRegistrationState(int registrationState) {
		this.registrationState = registrationState;
	}
}
