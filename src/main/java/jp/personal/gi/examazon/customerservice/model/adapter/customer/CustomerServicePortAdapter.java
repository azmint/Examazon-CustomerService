package jp.personal.gi.examazon.customerservice.model.adapter.customer;

import jp.personal.gi.examazon.customerservice.model.core.usecases.customer.CustomerService;
import jp.personal.gi.examazon.customerservice.model.port.models.customer.CustomerDto;
import jp.personal.gi.examazon.customerservice.model.port.models.customer.CustomerServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("jp.personal.gi.examazon.customerservice.model.adapter")
public class CustomerServicePortAdapter extends CustomerServicePort {
	@Autowired
	CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServicePortAdapter.class);
	}

	@Override
	public CustomerService customerService() {
		return customerService;
	}

	@Override
	public void register(CustomerDto customerDto) {
		super.register(customerDto);
	}

	@Override
	@RequestMapping("/{id}")
	public CustomerDto findBy(
			@PathVariable
					String id) {
		return super.findBy(id);
	}
}
