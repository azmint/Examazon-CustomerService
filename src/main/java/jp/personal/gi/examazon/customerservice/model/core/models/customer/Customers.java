package jp.personal.gi.examazon.customerservice.model.core.models.customer;

import java.util.*;

public class Customers implements Iterable<Customer> {
	static final Customers EMPTY = new Customers(new ArrayList<>());

	final List<Customer> customers;

	public Customers(List<Customer> customers) {
		this.customers = Collections.unmodifiableList(customers);
	}

	public static Customers empty() {
		return EMPTY;
	}

	@Override
	public Iterator<Customer> iterator() {
		return this.customers.iterator();
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
