package jp.personal.gi.examazon.customerservice.model.core.models.user;

import jp.personal.gi.examazon.customerservice.model.core.support.ValueObject;

import java.util.Objects;

public class MailAddress implements ValueObject {
	final String value;

	public MailAddress(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MailAddress)) return false;
		MailAddress that = (MailAddress) o;
		return Objects.equals(value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "MailAddress{" +
			   "source='" + value + '\'' +
			   '}';
	}
}
