package jp.personal.gi.examazon.customerservice.model.support.domain.frame.repository;

public class RepositoryAccessException extends RuntimeException {
	public RepositoryAccessException(Throwable cause) {
		super("リポジトリアクセスに失敗しました。", cause);
	}
}
