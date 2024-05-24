package co.com.ludi.mongo.field;

import co.com.ludi.model.field.Field;
import co.com.ludi.model.field.gateways.IFieldRepository;
import co.com.ludi.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class FieldRepositoryAdapter extends AdapterOperations<Field, FieldData, String,
        FieldRepository> implements IFieldRepository {

    public FieldRepositoryAdapter(FieldRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Field.class));
    }
}
