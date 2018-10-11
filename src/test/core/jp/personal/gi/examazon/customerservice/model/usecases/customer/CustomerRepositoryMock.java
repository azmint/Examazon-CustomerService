package jp.personal.gi.examazon.customerservice.model.usecases.customer;

import jp.personal.gi.examazon.customerservice.model.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.models.customer.CustomerId;
import jp.personal.gi.examazon.customerservice.model.models.customer.CustomerRepository;
import jp.personal.gi.examazon.customerservice.model.models.customer.Customers;
import jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository.RepositoryAccessException;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;

import java.util.Optional;

public class CustomerRepositoryMock implements CustomerRepository {
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
