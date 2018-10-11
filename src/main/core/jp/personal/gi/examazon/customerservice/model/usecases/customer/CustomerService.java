package jp.personal.gi.examazon.customerservice.model.usecases.customer;

import jp.personal.gi.examazon.customerservice.model.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.models.customer.CustomerRepository;
import jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository.RepositoryAccessException;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;

public abstract class CustomerService {
	CustomerRepository repository;

	public Either<CanNotRegisterCustomerException, Customer> register(Customer customer) {
		Either<RepositoryAccessException, Customer> registered = this.repository.register(customer);
		return registered.mapLeft(CanNotRegisterCustomerException ::new);
	}
}
