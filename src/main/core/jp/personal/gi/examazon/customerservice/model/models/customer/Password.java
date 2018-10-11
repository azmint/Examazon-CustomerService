package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.ValueObject;

import java.util.Objects;

public class Password implements ValueObject {
	final String value;

	public Password(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Password)) return false;
		Password password = (Password) o;
		return Objects.equals(value, password.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "Password{" +
			   "value='" + value + '\'' +
			   '}';
	}
}
