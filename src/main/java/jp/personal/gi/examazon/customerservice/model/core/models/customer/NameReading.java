package jp.personal.gi.examazon.customerservice.model.core.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.support.ValueObject;

import java.util.Objects;

public class NameReading implements ValueObject {
	final String value;

	public NameReading(String value) {
		this.value = value;
	}

	public String source() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof NameReading)) return false;
		NameReading that = (NameReading) o;
		return Objects.equals(value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "nameReading{" +
			   "source='" + value + '\'' +
			   '}';
	}

}
