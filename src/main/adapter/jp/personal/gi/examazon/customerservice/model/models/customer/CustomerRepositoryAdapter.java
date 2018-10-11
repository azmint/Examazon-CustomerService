package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository.RepositoryAccessException;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;

import java.util.Optional;

public class CustomerRepositoryAdapter implements CustomerRepository {
	@Override
	public Either<RepositoryAccessException, Customer> register(Customer entity) {
		return null;
	}

	@Override
	public Either<RepositoryAccessException, Optional<Customer>> delete(CustomerId id) {
		return null;
	}

	@Override
	public Either<RepositoryAccessException, Customers> findAll() {
		return null;
	}

	@Override
	public Either<RepositoryAccessException, Optional<Customer>> findBy(CustomerId id) {
		return null;
	}
}
