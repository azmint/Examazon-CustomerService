package jp.personal.gi.examazon.customerservice.controller.customer;

import jp.personal.gi.examazon.customerservice.model.port.models.customer.CustomerDto;
import jp.personal.gi.examazon.customerservice.model.port.models.customer.CustomerServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerServiceController {
	@Autowired
	CustomerServicePort customerServicePort;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public CustomerDto home(@PathVariable String id) {
		Optional<CustomerDto> maybeCustomerDto = customerServicePort.findBy(id);
		return maybeCustomerDto.orElse(null);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String findAll(Model model) {
		List<CustomerDto> customerDtos = customerServicePort.findAll();
		model.addAttribute("customers", customerDtos);
		return "customer/allcustomer";
	}

	@RequestMapping(value = "/register/{id}/{name}/{nameReading}/{registrationState}")
	@ResponseBody
	public void register(@PathVariable String id, @PathVariable String name, @PathVariable String nameReading, @PathVariable int registrationState) {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(id);
		customerDto.setName(name);
		customerDto.setNameReading(nameReading);
		customerDto.setRegistrationState(registrationState);
		customerServicePort.register(customerDto);
	}
}
