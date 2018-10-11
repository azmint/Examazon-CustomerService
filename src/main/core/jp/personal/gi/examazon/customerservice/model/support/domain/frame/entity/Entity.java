package jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity;

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
