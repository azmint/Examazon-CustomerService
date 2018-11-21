package jp.personal.gi.examazon.customerservice.model.core.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.support.entity.id.EntityIdGenerator;
import jp.personal.gi.examazon.customerservice.model.core.support.repository.Repository;
import jp.personal.gi.examazon.customerservice.model.core.support.repository.RepositoryAccessException;

public interface CustomerRepository extends Repository<CustomerId, Customer>, EntityIdGenerator<CustomerId> {
	void register(Customer customer) throws RepositoryAccessException;
}
