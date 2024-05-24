package co.com.ludi.usecase.field;

import co.com.ludi.model.field.Field;
import co.com.ludi.model.field.gateways.IFieldRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GetFieldUseCase {
    private final IFieldRepository fieldRepository;

    public Mono<Field> findFieldById(String id) {
        return this.fieldRepository.findById(id);
    }

    public Flux<Field> findAllFields() {
        return this.fieldRepository.findAll();
    }
}
