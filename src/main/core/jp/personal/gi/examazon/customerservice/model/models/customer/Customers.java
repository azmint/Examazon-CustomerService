package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.entity.Entities;

import java.util.List;
import java.util.Objects;

public class Customers implements Entities<CustomerId, Customer> {
	final List<Customer> customers;

	public Customers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Customers)) return false;
		Customers customers1 = (Customers) o;
		return Objects.equals(customers, customers1.customers);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public String toString() {
		return "Customers{" +
			   "customers=" + customers +
			   '}';
	}
}
