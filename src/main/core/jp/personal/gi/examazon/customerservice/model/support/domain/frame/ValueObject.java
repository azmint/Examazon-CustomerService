package jp.personal.gi.examazon.customerservice.model.support.domain.frame;

public interface ValueObject {
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
