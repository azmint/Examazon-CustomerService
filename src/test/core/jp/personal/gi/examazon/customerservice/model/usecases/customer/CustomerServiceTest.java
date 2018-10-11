package jp.personal.gi.examazon.customerservice.model.usecases.customer;

import jp.personal.gi.examazon.customerservice.model.models.customer.*;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;
import org.junit.Test;

public class CustomerServiceTest {
	@Test
	public void registerTest() {
		CustomerService customerService = new CustomerServiceMock();
		Either<CanNotRegisterCustomerException, Customer> result = customerService.register(new Customer(new CustomerId(""),
																										   new CustomerName(""),
																										   new MailAdress(""),
																										   new PhoneNumber(""),
																										   new Password("")));
	}
}
