package jp.personal.gi.examazon.customerservice.model.adapter.models.customer;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerRecordMapper {
	@Insert("INSERT INTO customer (id, name, nameReading, registrationState) VALUES (#{id}, #{name}, #{nameReading}, #{registrationState})")
	void insert(CustomerRecord customerRecord);

	@Select("SELECT id, name, nameReading, registrationState FROM customer WHERE id = #{id}")
	CustomerRecord selectWhereId(String id);

	@Select("SELECT id, name, nameReading, registrationState FROM customer")
	List<CustomerRecord> selectAll();

	@Delete("DELETE FROM customer WHERE ID = #{id}")
	void delete(String id);
}
