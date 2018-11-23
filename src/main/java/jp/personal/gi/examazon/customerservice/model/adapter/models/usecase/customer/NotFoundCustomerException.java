package jp.personal.gi.examazon.customerservice.model.adapter.models.usecase.customer;

import jp.personal.gi.examazon.customerservice.model.core.models.customer.CustomerId;

public class NotFoundCustomerException extends RuntimeException {
	public NotFoundCustomerException(Throwable cause) {
		super("指定されたIDが存在しません。", cause);
	}

	public NotFoundCustomerException(CustomerId customerId) {
		super("指定されたIDが存在しません。,id=[" + customerId + "]");
	}
}
