package jp.personal.gi.examazon.customerservice.model.core.models.customer;

public enum RegistrationState {
	Temporary,
	Regular,
	Prime,
	Withdrawal,
	;

	public int source() {
		return ordinal();
	}
}
