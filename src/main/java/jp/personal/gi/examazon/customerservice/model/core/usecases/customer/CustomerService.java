package jp.personal.gi.examazon.customerservice.model.core.usecases.customer;

import jp.personal.gi.examazon.customerservice.model.adapter.models.usecase.customer.NotFoundCustomerException;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerId;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerRepository;
import jp.personal.gi.examazon.customerservice.model.core.support.repository.RepositoryAccessException;

import java.util.Optional;

public abstract class CustomerService {
	protected abstract CustomerRepository repository();

	public void register(Customer customer) throws jp.personal.gi.examazon.customerservice.model.core.usecases.customer.CanNotRegisterCustomerException {
		try {
			this.repository().register(customer);
		} catch (RepositoryAccessException e) {
			throw new CanNotRegisterCustomerException(e);
		}
	}

	public Optional<Customer> findBy(CustomerId customerId) throws NotFoundCustomerException {
		try {
			return this.repository().findBy(customerId);
		} catch (RepositoryAccessException e) {
			throw new NotFoundCustomerException(e);
		}
	}
}
