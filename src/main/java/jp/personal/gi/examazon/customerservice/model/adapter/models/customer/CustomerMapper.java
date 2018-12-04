package jp.personal.gi.examazon.customerservice.model.adapter.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.*;

import java.util.Arrays;
import java.util.function.BiConsumer;

public enum CustomerMapper {
	id((customerRecord, customerBuilder) -> customerBuilder.withId(new CustomerId(customerRecord.customer_id))),
	name((customerRecord, customerBuilder) -> customerBuilder.withName(new CustomerName(customerRecord.name))),
	nameReading((customerRecord, customerBuilder) -> customerBuilder.withNameReading(new NameReading(customerRecord.name_Reading))),
	registrationState((customerRecord, customerBuilder) -> customerBuilder.withRegistrationState(RegistrationState.values()[customerRecord.registration_State])),;

	final BiConsumer<CustomerRecord, CustomerBuilder> mapping;

	CustomerMapper(BiConsumer<CustomerRecord, CustomerBuilder> mapping) {
		this.mapping = mapping;
	}

	static Customer apply(CustomerRecord customerRecord) {
		CustomerBuilder builder = new CustomerBuilder();
		Arrays.asList(values()).forEach(customerMapper -> customerMapper.mapping.accept(customerRecord, builder));
		return builder.build();
	}
}
