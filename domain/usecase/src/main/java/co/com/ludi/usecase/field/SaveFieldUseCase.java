package co.com.ludi.usecase.field;

import co.com.ludi.model.field.Field;
import co.com.ludi.model.field.gateways.IFieldRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SaveFieldUseCase {
    private IFieldRepository fieldRepository;

    public Mono<Field> save(Field field) {
        return this.fieldRepository.save(field);
    }
}
