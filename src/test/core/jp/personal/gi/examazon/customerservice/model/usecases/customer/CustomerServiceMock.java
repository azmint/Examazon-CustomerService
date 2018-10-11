package jp.personal.gi.examazon.customerservice.model.usecases.customer;

import jp.personal.gi.examazon.customerservice.model.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.models.customer.CustomerId;
import jp.personal.gi.examazon.customerservice.model.models.customer.CustomerRepository;
import jp.personal.gi.examazon.customerservice.model.models.customer.Customers;
import jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository.RepositoryAccessException;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;

import java.util.Optional;
import java.util.function.Function;

public class CustomerServiceMock extends CustomerService {
	public CustomerServiceMock() {
		this.repository = new CustomerRepository() {
			@Override
			public Either<RepositoryAccessException, Customer> register(Customer entity) {
				return new Either<RepositoryAccessException, Customer>() {
					@Override
					public <T> Either<T, Customer> mapLeft(Function<? super RepositoryAccessException, T> mapper) {
						return new Either<T, Customer>() {
							@Override
							public <T1> Either<T1, Customer> mapLeft(Function<? super T, T1> mapper) {
								return null;
							}
						};
					}
				};
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
		};
	}
}
