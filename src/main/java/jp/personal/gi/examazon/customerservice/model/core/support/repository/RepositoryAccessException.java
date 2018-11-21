package jp.personal.gi.examazon.customerservice.model.core.support.repository;

public class RepositoryAccessException extends RuntimeException {
	public RepositoryAccessException() {
		super("リポジトリアクセスに失敗しました。");
	}

	public RepositoryAccessException(Throwable cause) {
		super("リポジトリアクセスに失敗しました。", cause);
	}
}
