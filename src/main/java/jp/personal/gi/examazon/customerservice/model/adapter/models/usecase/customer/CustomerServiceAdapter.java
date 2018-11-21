package jp.personal.gi.examazon.customerservice.model.adapter.models.usecase.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerRepository;
import jp.personal.gi.examazon.customerservice.model.core.usecases.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public final class CustomerServiceAdapter extends CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	protected CustomerRepository repository() {
		return this.customerRepository;
	}
}
