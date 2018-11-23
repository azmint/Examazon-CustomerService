package jp.personal.gi.examazon.customerservice.model.core.support.entity.id;

public interface EntityIdGenerator<T extends EntityId> {
	T generateId();
}
