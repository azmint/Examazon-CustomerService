package jp.personal.gi.examazon.customerservice.model.port.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerId;
import jp.personal.gi.examazon.customerservice.model.core.usecases.customer.CustomerService;

import java.util.Optional;

public abstract class CustomerServicePort {
	public abstract CustomerService customerService();

	public void register(CustomerDto customerDto) {
		Customer customer = CustomerSampleMapper.toEntity(customerDto);
		this.customerService().register(customer);
	}

	public CustomerDto findBy(String id) {
		CustomerId customerId = new CustomerId(id);
		Optional<Customer> maybeCustomer = this.customerService().findBy(customerId);
		return maybeCustomer.map(CustomerSampleMapper :: toDto).orElse(null);
	}
}
