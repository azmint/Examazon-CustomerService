package jp.personal.gi.examazon.customerservice.model.core.support.entity;

import jp.personal.gi.examazon.customerservice.model.core.support.entity.id.EntityId;

public interface Entity<T extends EntityId> {
	T id();

	boolean matches(T id);

	default boolean notMatches(T id) {
		return !matches(id);
	}

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	default boolean notEquals(Object obj) {
		return !equals(obj);
	}

	@Override
	String toString();
}
