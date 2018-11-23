package jp.personal.gi.examazon.customerservice.model.port.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.*;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class CustomerSampleMapper {
	public static Customer toEntity(CustomerDto customerDto) {
		return EntityMapper.apply(customerDto);
	}

	public static CustomerDto toDto(Customer customer) {
		return DtoMapper.apply(customer);
	}

	private enum DtoMapper {
		id((customer, customerDto) -> customerDto.setId(customer.id().source())),
		name((customer, customerDto) -> customerDto.setName(customer.name().source())),
		nameReading((customer, customerDto) -> customerDto.setNameReading(customer.nameReading().source())),
		registrationState((customer, customerDto) -> customerDto.setRegistrationState(customer.registrationState().source())),;

		final BiConsumer<Customer, CustomerDto> mapping;

		DtoMapper(BiConsumer<Customer, CustomerDto> mapping) {
			this.mapping = mapping;
		}

		public static CustomerDto apply(Customer customer) {
			CustomerDto customerDto = new CustomerDto();
			Arrays.asList(values()).forEach(customerMapper -> customerMapper.mapping.accept(customer, customerDto));
			return customerDto;
		}
	}

	private enum EntityMapper {
		id((customerDto, customerBuilder) -> customerBuilder.withId(new CustomerId(customerDto.id))),
		name((customerDto, customerBuilder) -> customerBuilder.withName(new CustomerName(customerDto.name))),
		nameReading((customerDto, customerBuilder) -> customerBuilder.withNameReading(new NameReading(customerDto.nameReading))),
		registrationState((customerDto, customerBuilder) -> customerBuilder
				.withRegistrationState(RegistrationState.values()[customerDto.registrationState])),
		;

		final BiConsumer<CustomerDto, CustomerBuilder> mapping;

		EntityMapper(BiConsumer<CustomerDto, CustomerBuilder> mapping) {
			this.mapping = mapping;
		}

		public static Customer apply(CustomerDto customerDto) {
			CustomerBuilder builder = new CustomerBuilder();
			Arrays.asList(values()).forEach(entityMapper -> entityMapper.mapping.accept(customerDto, builder));
			return builder.build();
		}
	}
}
