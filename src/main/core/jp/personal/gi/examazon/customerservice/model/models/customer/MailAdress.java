package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.ValueObject;

import java.util.Objects;

public class MailAdress implements ValueObject {
	final String value;

	public MailAdress(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MailAdress)) return false;
		MailAdress that = (MailAdress) o;
		return Objects.equals(value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "MailAdress{" +
			   "value='" + value + '\'' +
			   '}';
	}
}
