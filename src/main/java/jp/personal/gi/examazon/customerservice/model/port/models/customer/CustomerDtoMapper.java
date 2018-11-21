package jp.personal.gi.examazon.customerservice.model.port.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.Customer;

import java.util.Arrays;
import java.util.function.BiConsumer;

public enum CustomerDtoMapper {
	Id((customer, customerDto) -> customerDto.setId(customer.id().source())),
	Name((customer, customerDto) -> customerDto.setName(customer.name().source())),
	NameReading((customer, customerDto) -> customerDto.setNameReading(customer.nameReading().source())),
	RegistrationState((customer, customerDto) -> customerDto.setRegistrationState(customer.registrationState().source())),
	;

	final BiConsumer<Customer, CustomerDto> mapping;

	CustomerDtoMapper(BiConsumer<Customer, CustomerDto> mapping) {
		this.mapping = mapping;
	}

	public static CustomerDto apply(Customer customer) {
		CustomerDto customerDto = new CustomerDto();
		Arrays.asList(values()).forEach(customerMapper -> customerMapper.mapping.accept(customer, customerDto));
		return customerDto;
	}
}
