package jp.personal.gi.examazon.customerservice.model.adapter.customer;

import jp.personal.gi.examazon.customerservice.model.core.usecases.customer.CustomerService;
import jp.personal.gi.examazon.customerservice.model.port.models.customer.CustomerServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServicePortAdapter extends CustomerServicePort {
	@Autowired
	CustomerService customerService;

	@Override
	public CustomerService customerService() {
		return customerService;
	}
}
