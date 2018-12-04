package jp.personal.gi.examazon.customerservice.model.adapter.models.customer;

public class CustomerRecord {
	String customer_id;
	String name;
	String name_Reading;
	int registration_State;

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_Reading() {
		return name_Reading;
	}

	public void setName_Reading(String name_Reading) {
		this.name_Reading = name_Reading;
	}

	public int getRegistration_State() {
		return registration_State;
	}

	public void setRegistration_State(int registration_State) {
		this.registration_State = registration_State;
	}
}
