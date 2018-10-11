package jp.personal.gi.examazon.customerservice.model.models.customer;

import jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository.Repository;
import jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository.RepositoryAccessException;
import jp.personal.gi.examazon.customerservice.model.support.maybe.Either;

public interface CustomerRepository extends Repository<CustomerId, Customer, Customers> {
}
