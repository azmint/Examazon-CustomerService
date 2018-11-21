package jp.personal.gi.examazon.customerservice.model.core.usecases.customer;

public class CanNotRegisterCustomerException extends RuntimeException {
	public CanNotRegisterCustomerException(Throwable cause) {
		super("登録できません。", cause);
	}
}
