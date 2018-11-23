package jp.personal.gi.examazon.customerservice.model.core.support.repository;


import jp.personal.gi.examazon.customerservice.model.core.support.entity.Entity;
import jp.personal.gi.examazon.customerservice.model.core.support.entity.id.EntityId;

import java.util.List;
import java.util.Optional;

public interface Repository<T extends EntityId, E extends Entity<T>> {
	List<E> findAll() throws RepositoryAccessException;

	Optional<E> findBy(T id) throws RepositoryAccessException;
}
