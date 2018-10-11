package jp.personal.gi.examazon.customerservice.model.support.maybe;

import java.util.function.Function;

public interface Either<L, R> {
	<T> Either<T, R> mapLeft(Function<? super L, T> mapper);
}
