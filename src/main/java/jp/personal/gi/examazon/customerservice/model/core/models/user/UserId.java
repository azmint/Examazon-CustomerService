package jp.personal.gi.examazon.customerservice.model.core.models.user;


import jp.personal.gi.examazon.customerservice.model.core.support.entity.id.EntityId;

import java.util.Objects;

public final class UserId implements EntityId {
	final String value;

	public UserId(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UserId)) return false;
		UserId userId = (UserId) o;
		return Objects.equals(value, userId.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "UserId{" +
			   "source='" + value + '\'' +
			   '}';
	}
}
