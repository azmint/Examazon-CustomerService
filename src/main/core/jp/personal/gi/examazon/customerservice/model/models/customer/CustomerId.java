package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity.EntityId;

import java.util.Objects;

public class CustomerId implements EntityId {
	final String value;

	public CustomerId(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CustomerId)) return false;
		CustomerId that = (CustomerId) o;
		return Objects.equals(value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "CustomerId{" +
			   "value='" + value + '\'' +
			   '}';
	}
}
