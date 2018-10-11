package jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity.Entities;
import jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity.Entity;
import jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity.EntityId;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;

import java.util.Optional;

public interface Repository<T extends EntityId, E extends Entity<T>, L extends Entities<T, E>> {
	Either<RepositoryAccessException, E> register(E entity);

	Either<RepositoryAccessException, Optional<E>> delete(T id);

	Either<RepositoryAccessException, L> findAll();

	Either<RepositoryAccessException, Optional<E>> findBy(T id);
}
