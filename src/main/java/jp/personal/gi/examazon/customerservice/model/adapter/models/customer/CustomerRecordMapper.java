package jp.personal.gi.examazon.customerservice.model.adapter.models.customer;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerRecordMapper {
	@Insert("INSERT INTO CUSTOMER (customer_id, name, name_reading, registration_state) VALUES (#{customer_id}, #{name}, #{name_Reading}, #{registration_State})")
	void insert(CustomerRecord customerRecord);

	@Select("SELECT customer_id, name, name_reading, registration_state FROM CUSTOMER WHERE customer_id = #{customer_id}")
	CustomerRecord selectWhereId(String id);

	@Select("SELECT customer_id, name, name_reading, registration_state FROM CUSTOMER")
	List<CustomerRecord> selectAll();

	@Delete("DELETE FROM CUSTOMER WHERE customer_id = #{customer_id}")
	void delete(String id);
}
