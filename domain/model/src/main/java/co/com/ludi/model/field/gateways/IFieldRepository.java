package co.com.ludi.model.field.gateways;

import co.com.ludi.model.field.Field;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IFieldRepository {
    Mono<Field> save (Field field);
    Mono<Field> findById (String id);
    Flux<Field> findAll();
}
