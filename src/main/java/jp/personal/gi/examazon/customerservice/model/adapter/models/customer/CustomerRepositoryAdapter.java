package jp.personal.gi.examazon.customerservice.model.adapter.models.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.Customer;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerId;
import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerRepository;
import jp.personal.gi.examazon.customerservice.model.core.support.repository.RepositoryAccessException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@MapperScan(basePackages = { "jp.personal.gi.examazon.customerservice.model.adapter.models.customer" })
public class CustomerRepositoryAdapter implements CustomerRepository {
	@Autowired
	CustomerRecordMapper customerRecordMapper;

	@Override
	public void register(Customer entity) throws RepositoryAccessException {
		CustomerRecord customerRecord = new CustomerRecord();
		customerRecord.customer_id = entity.id().source();
		customerRecord.name = entity.name().source();
		customerRecord.name_Reading = entity.nameReading().source();
		customerRecord.registration_State = entity.registrationState().source();
		customerRecordMapper.insert(customerRecord);
	}

	@Override
	public List<Customer> findAll() throws RepositoryAccessException {
		List<CustomerRecord> customerRecords = this.customerRecordMapper.selectAll();
		return customerRecords.stream().map(CustomerMapper::apply).collect(Collectors.toList());
	}

	@Override
	public Optional<Customer> findBy(CustomerId id) throws RepositoryAccessException {
		return Optional.ofNullable(this.customerRecordMapper.selectWhereId(id.source()))
				.map(CustomerMapper :: apply);
	}

	@Override
	public CustomerId generateId() {
		return new CustomerId("AAAAAAAA");
	}
}
