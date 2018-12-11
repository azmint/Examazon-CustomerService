package jp.personal.gi.examazon.customerservice.model.port.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerId;
import jp.personal.gi.examazon.customerservice.model.core.usecases.customer.CustomerService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class CustomerServicePort {
	protected abstract CustomerService customerService();

	public void register(CustomerDto customerDto) {
		Customer customer = CustomerSampleMapper.toEntity(customerDto);
		this.customerService().register(customer);
	}

	public Optional<CustomerDto> findBy(String id) {
		CustomerId customerId = new CustomerId(id);
		Optional<Customer> maybeCustomer = this.customerService().findBy(customerId);
		return maybeCustomer.map(CustomerDtoMapper::apply);
	}

	public List<CustomerDto> findAll() {
		List<Customer> customers = this.customerService().findAll();
		return customers.stream()
				.map(CustomerDtoMapper::apply)
				.collect(Collectors.toList());
	}
}
